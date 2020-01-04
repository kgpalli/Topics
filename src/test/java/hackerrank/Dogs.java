package hackerrank;

public class Dogs extends Animals {
  //  when we extend an abstract class we need to implemetn either the methods in abstract super class or create an abstarct methdd
    public Dogs()
    {
        super(15);  // it refers Animal class constructor

        System.out.println(" 3+ Dog has been created");
    }
    public void eat (){
        System.out.println("The dog is eating");
    }
    //  when we extend an abstract class we need to implemetn either the methods in abstract super class or create an abstarct method
    // public abstract eat();

public void ruff()
{
    System.out.println("3 + Dog's name is ruff");
}

    public void run()
    {
        System.out.println(" 3 + Dog is running");
    }

    public void sleep() { System.out.println("Dog is sleeping "); }


}
