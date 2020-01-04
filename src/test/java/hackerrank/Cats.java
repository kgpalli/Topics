package hackerrank;

public class Cats extends Animals { // when we extend an abstract class we need to implemetn either the methods in abstract super class or create an abstarct methdd

    public Cats()
    {
        super(07);
        System.out.println(" 2 + A cat is created");
    }

    public void eat (){
        System.out.println("The cat is eating");
    }

    public void meow()
    {
       System.out.println(" 2 + A cat meow's");
    }
    public void prance()
    {
System.out.println(" 2 + prances");
    }
}
