package inheritance;

public class Main {


    public static void main(String[] args)
    {
        A a = new B();  // 3
      //  System.out.println( a.i);

        C c = new C(); // 2
      //  System.out.println(c.s);
        // creates object of Class A ,    Ans=10
        // Calls super class values
        // Always static blocks are callled first in order

        Y.staticMethod();
        // static method differs from static block, when we call it give the vaue of same class not super class
        // Note : To pass value to super class constructor pass it explicitly, EX. Super(10)
        // Note : Constructor calling statements ( super() or this() ), if written, must be the first statements in the constructor.Correct Code
    }
}
