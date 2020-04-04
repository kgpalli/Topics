package threadlocal;

public class ThreadLocalPr1 {
    public static void main(String[] args) {

        ThreadLocal<String>localData = new ThreadLocal<String>();

        // setting the value
        localData.set("Manju");

        // returns the current thread's value
        System.out.println("Name  is :" +localData.get());

        localData.set("Lilly");

        System.out.println("Name is :" +localData.get());

        localData.set("Bavitha");

        System.out.println("Name is :" +localData.get());

        localData.set("Rajani");

        System.out.println("Name is :" +localData.get());

        localData.set("Vani");

        System.out.println("Name is :" +localData.get());

        localData.remove();
        System.out.println("Name is :" +localData.get());
    }


}

class NewThread extends Thread{
    private static ThreadLocal  value = new ThreadLocal(){
        @Override
        protected Object initialValue() {
            return new Integer(question--);
        }
    };

    private static int question = 15;

    NewThread (String name){
        super(name);
        start();
    }

    public void run(){
        for(int i=0;i<2;i++){
            System.out.println(getName() + " " + value.get());
        }
    }
}

 class ThreadLocalDemo{

    public static void main(String[] args) {

        NewThread nt1 = new NewThread("quiz1");
        NewThread nt2 = new NewThread("quiz2");


    }

}


