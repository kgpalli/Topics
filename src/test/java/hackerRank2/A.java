package hackerRank2;

public class A {
    String name = " apple";

     String apple()
    {
        return name;
    }
}

 class B extends A{


    String type = "fruit";
    String apple()
    {
        return type;
    }

    public static void main(String args[]) {

        A a1 = new B();

        String value = a1.apple();
        System.out.println(value);

        B b1 = new B();
        String value1 = b1.apple();
         System.out.println(value1);



     }

}
