package geeksforgeeks


//import com.github.webdriverextensions.WebRepository

import groovyjarjarcommonscli.MissingArgumentException
import org.openqa.selenium.By
import org.openqa.selenium.InvalidElementStateException
import org.openqa.selenium.TimeoutException
import org.openqa.selenium.WebDriverException
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.pagefactory.Annotations
import java.lang.reflect.Field
import java.security.InvalidParameterException

class HandlePageElements {
    boolean key_exists(String key, no_error=false) throws MissingArgumentException {

        boolean exists = this.karguments.containsKey(key)
        if (!exists && !no_error) throw new MissingArgumentException("Missing argument: [$key]..")

        return exists
    }


    void go_to_page(String new_url=null, Object[] replacements=null){

        //server config can't be defined until the server_label
        //is passed by the child page object, so let's define it now
        this.server_config = (Map)this.test.config_env.server((String)this.server_label)

        //if new url is specified, then navigate there
        if(new_url != null){
            this.test.browser.get(new_url)
            return
        }

        //if page_url has full url, then navigate there
        if(this.page_url.contains("http")){
            this.test.browser.get(new_url)
            return
        }

        //if there's replacement use it
        if(replacements != null)  this.page_url = String.format((String)this.page_url, replacements)

        //finally, let's just use page_url with server config to
        //navigate to the page location
        String hostname = this.server_config.hostname
        String port = this.server_config.port
        this.test.browser.navigate("$hostname:$port/${this.page_url}".replace('//', '/'))
    }


    By to_by(String element_name){

        Field field = this.getClass().getDeclaredField(element_name)

        Annotations annotations = new Annotations(field)

        return annotations.buildBy()
    }


    By to_by(String by, String value, Object[] replacements){

        return By."$by"(String.format(value, replacements))
    }


    By by_identifier(def identifier){

        By by

        if(identifier instanceof String){
            by = to_by(identifier)
        } else if(identifier instanceof By)
            by = identifier
        else {
            throw new InvalidParameterException("Accepts String or By only..")
        }

        return by
    }


    WebElement until_loaded(Object identifier, int timeout=0, int polltime=0, boolean no_failure=false){

        By by = this.by_identifier(identifier)

        Object result = until_all_loaded(by, timeout, polltime, no_failure)

        if(!(result instanceof List<WebElement>)) return null

        if(result.size() > 1) throw new IndexOutOfBoundsException(
                "Found more than 1 element, use [until_all_loaded()] instead..")

        return result[0]
    }


    List<WebElement> until_all_loaded(Object identifier, int timeout=0, int polltime=0, boolean no_failure=false){

        By by = this.by_identifier(identifier)

        def closure = { return this.session.findElements(by) }

        Object result = Wait.until_time_out(closure, timeout, polltime, true)

        if(!(result instanceof List<WebElement>)) {
            if(!no_failure) throw new NoSuchElementException("$by not found..")
            this.log.debug("Element(s): $by not found..")
            return null
        }

        return (List<WebElement>)result
    }


    void until_text_entered(Object identifier, String text, int timeout=0, int polltime=0, use_javascript=false){

        WebElement element = identifier instanceof WebElement ?
                identifier : this.until_loaded(identifier, timeout, polltime)

        //just clear the field if text entered is null or empty
        if(!text){
            element.clear()
            return
        }

        def closure = {

            element.clear()

            if(use_javascript) this.session.executeScript("arguments[0].value='$text';", element)

            else element.sendKeys(text)

            String entered = !element.getText() ? element.getAttribute("value") : element.getText()
            return entered == text
        }

        if(!Wait.until_time_out(closure, timeout, polltime, true))
            throw new TimeoutException("Retried, but still couldn't enter text: [$text]..")
    }


    boolean until_displayed(Object identifier, int timeout=0, int polltime=0){

        WebElement element = identifier instanceof WebElement ?
                identifier : this.until_loaded(identifier, timeout, polltime)

        return Wait.until_time_out({element.&isDisplayed()}, timeout, polltime, true)
    }


    boolean until_enabled(Object identifier, int timeout=0, int polltime=0){

        WebElement element = identifier instanceof WebElement ?
                identifier : this.until_loaded(identifier, timeout, polltime)

        return Wait.until_time_out({element.&isEnabled()}, timeout, polltime, true)
    }

    void until_clicked(Object identifier, int timeout=0, int polltime=0, boolean use_javascript=false){

        WebElement element = identifier instanceof WebElement ?
                identifier : this.until_loaded(identifier, timeout, polltime)

        if(this.until_displayed(element, timeout, polltime) && this.until_enabled(element, timeout, polltime)) {

            if (use_javascript) this.session.executeScript("arguments[0].click();", element)
            else element.click()
            return
        }

        throw new InvalidElementStateException("Element not displayed/enabled to click on..")
    }


    boolean until_selected(Object identifier, int timeout=0, int polltime=0, boolean use_javascript=false){

        WebElement element = identifier instanceof WebElement ?
                identifier : this.until_loaded(identifier, timeout, polltime)

        def closure = {
            this.until_clicked(element, timeout, polltime, use_javascript)
            return element.isSelected()
        }

        return Wait.until_time_out(closure, timeout, polltime, true)
    }


    boolean until_deselected(Object identifier, int timeout=0, int polltime=0, boolean use_javascript=false){

        WebElement element = identifier instanceof WebElement ?
                identifier : this.until_loaded(identifier, timeout, polltime)

        if(!element.isSelected()) return true

        def closure = {
            this.until_clicked(element, timeout, polltime, use_javascript)
            return !element.isSelected()
        }

        return Wait.until_time_out(closure, timeout, polltime, true)
    }

    boolean until_page_ready(int timeout=0, int polltime=0){

        def closure = { return (boolean) this.session.executeScript("return jQuery.active == 0;")}

        return Wait.until_time_out(closure, timeout, polltime, true)
    }


}
