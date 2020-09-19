package lib

import groovyjarjarcommonscli.MissingArgumentException

/**
     * a super class to all module classes.  It provides
     * constant behavior and tools to group business/project
     * related actions.
     *
     * Module minimum requirements:
     *     - must use @inheritConstructor (from Groovy)
     *     - first of the arguments must be an Instance Object
     *
     *
     * Module Behavior:
     *
     *     - On call following will be executed in order:
     *         > constructor
     *         > before_module
     *         > execute_module (NOTE: skipped if before_module fails)
     *         > after_module
     *
     *     = First of the arguments must be an object of BaseTest
     *       this is because besides assertions a module is basically
     *       an extension of a test(s)
     *
     *     - Return value is reserved only from the execute_module run
     *       and is stored in .return_value variable/field
     *
     *     - Suppress error is by default false (off), if set to true (on)
     *       will, except system.exit, ignore any exception encountered
     *
     *     - Runtime exception from before and execute module (if not suppressed)
     *       is sent to 'return_value' and the exception message will be copied to
     *       'message'.  If exception again occured during after_module 'message'
     *       will be overwritten with the new exception's message
     *
     * @param args (ArrayList<?>): arguments passed in
     * @param kwargs (Map<?, ?>): keyword arguments passed in
     * @param test (BaseTest): test object
     * @param suppress_error (bool): (false) switch to ignore exceptions
     * @return: there's no direct return from the module (see behavior)
     *
     * [TEMPLATE]
     *
     * package aexp.ecptest.mod.common
     * import aexp.ecptest.lib.*
     * import groovy.transform.InheritConstructors
     *
     * @InheritConstructors
     * class ModuleName extends BaseModule implements BaseModuleBlank {}
     *
     */

    abstract class BaseModule {

        protected boolean _skip_before_module = false
        protected boolean _skip_after_module = false
        protected boolean _skip_execute_module = false

        protected def test //dynamic test object
        protected def log // test specific logger

        protected String class_name
        protected Config config_env
        protected Config config_main
        protected Map config_test

        String current_environment
        Object return_value
        Object[] arguments
        Map karguments
        String message
        boolean suppress_error
        Payload spec

        def before_module(){this._skip_before_module = true}
        def execute_module(){this._skip_execute_module = true}
        def after_module(){this._skip_after_module = true}

        //constructors for: w/param and w/o param, for subclasses
        //use: @InheritConstructors annotation
        BaseModule(){throw new MissingArgumentException("Expecting parameters..")}
        BaseModule(Map kwargs=[:], ...args){

            if(args.length == 0 || !(args[0] instanceof BaseTest)){
                throw new Exception("Expected a BaseTest object as first of the arguments..")
            }

            this.class_name = this.getClass().getName()
            this.arguments = args //arguments: [1, 2, 3]
            this.karguments = kwargs //keyword arguments: label: "test"
            this.test = args[0]
            this.log = this.test.log
            this.current_environment = this.test.current_environment
            this.config_env = this.test.config_env
            this.config_main = this.test.config_main
            this.config_test = this.test.config_test
            this.suppress_error = this.karguments.containsKey("suppress_error") ?
                    this.karguments.suppress_error : false //default

            try {

                //create a spec if "server_label", "spec_controls", and "spec_defaults" are specified
                boolean has_explicit_payload = this.key_exists("payload", true)
                boolean has_implicit_payload = ["server_label", "spec_controls", "spec_defaults"].every {this.hasProperty(it)}
                if(has_explicit_payload || has_implicit_payload){
                    this.spec = new Payload(this)
                    log.debug(this.class_name + " - specification created")
                }

                //running before_module
                //setting up request, preparing data
                this.before_module()
                if(!this._skip_before_module) log.debug(this.class_name + " - before module")

                //running execute
                //running main body, execute with return value
                this.return_value = this.execute_module()
                if(!this._skip_execute_module) log.debug(this.class_name + " - execute module")

            } catch (Exception e) {

                this.message = e.message
                this.return_value = e

                //Show stack trace only in debug mode
                if(Option.DEBUG) for(def message : e.stackTrace) log.warn(message.toString())

                if (!this.suppress_error) {
                    throw new RuntimeException(e)
                } else {
                    log.debug(e.message)
                }

            } finally {

                //running after_module
                //schedule the after module execution
                if(!this._skip_after_module) this.test.add_cleanup_task({

                    try {
                        this.after_module()
                        if(!this._skip_after_module) log.debug(this.class_name + " - after module")
                    } catch(Exception e){
                        this.message = e.message

                        //Show stack trace only in debug mode
                        if(Option.DEBUG) for(def message : e.stackTrace) log.warn(message.toString())

                        if (!this.suppress_error) {
                            throw new RuntimeException(e)
                        } else {
                            log.debug(e.message)
                        }
                    }
                })
            }
        }

        /**
         * Checks whether key exists in the karguments
         * throws argument not found exception if does not exist
         * exception can be suppressed using [no_error]
         * @param key String
         * @param no_error boolean
         * @return
         */
        boolean key_exists(String key, no_error=false) throws MissingArgumentException {

            boolean exists = this.karguments.containsKey(key)
            if(!exists && !no_error) throw new MissingArgumentException("Missing argument: [$key]..")

            return exists
        }

        /**
         * Checks whether keys exist in the karguments
         * throws argument not found exception if one/more keys do not exist
         * @param keys List
         * @param no_error boolean
         * @return boolean
         * @throws MissingArgumentException
         */
        boolean key_exists(List keys, no_error=false) throws MissingArgumentException {

            def missing = [] as List
            keys.each {if(!this.karguments.containsKey(it)) missing.add(it)}

            if(!missing) return true
            if(no_error) return false

            throw new MissingArgumentException("Missing following keys: $missing")
        }

        /**
         * Checks that key exists and variable (identifiable by key)
         * is not empty.  NOTE: will not throw exception if key does not exist
         * @param key String
         * @return boolean
         */
        boolean key_is_empty(String key){

            if(!this.key_exists(key, true)) return true

            return (this.karguments."$key" == "" || !(this.karguments."$key"))
        }
}
