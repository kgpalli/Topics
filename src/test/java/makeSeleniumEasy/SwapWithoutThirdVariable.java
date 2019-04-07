package makeSeleniumEasy;

public class SwapWithoutThirdVariable {

    public static void main(String[] args) {

        int a=20,b=90;

// swap without using third variable

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("Values after swap");
        System.out.println("a value is "+a);
        System.out.println("b value is : " + b);






    }
}
