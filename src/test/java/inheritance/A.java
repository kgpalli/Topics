package inheritance;



class A {

//    int i=10;
//    String s = "Class A";
    static

    {
       // System.out.println(10);
        System.out.println("Third");

    }
}

 class B extends A
{
    String s = "Class B";
    int i=20;
static
    {
//        System.out.println(20);
//        System.out.println(super.s);
        System.out.println("Second");
    }
}
class C extends B{
    String s = "Class C";
    static
    {
//        System.out.println(30);
//        System.out.println(super.s);
        System.out.println("First");

    }

}
class X
{
    static void staticMethod()
    {
        System.out.println("First Method");
    }
}
class Y extends X
{
    static void staticMethod()
    {
        System.out.println("Second Method");
    }
}