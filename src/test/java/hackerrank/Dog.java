package hackerrank;

public class Dog extends Animal {

    public Dog()
    {
        super(15);  // it refers Animal class constructor

        System.out.println(" 3+ Dog has been created");
    }

public void ruff()
{
    System.out.println("3 + Dog's name is ruff");
}

    public void run()
    {
        System.out.println("  Dog is running");
    }


}
