package hackerrank;

public abstract class Animals {
    private int age;


    public Animals(int age) {
        this.age = age;
        System.out.println("1 + Animal has been created");
    }

    public abstract void eat() ;
    public void sleep()
    {
        System.out.println("Animal is sleeping");
    }



    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Dogs d = new Dogs();
        Cats c = new Cats();
        System.out.println(d.getAge()); // getters make age variable handy
        System.out.println(c.getAge());
        /*d.ruff();
        d.run();
        c.meow();
        c.prance();
        a.eat();
        d.eat();
        c.eat();*/
        d.sleep(); // It has overridden method
        c.sleep(); // It doesn't have overriden method


        // casting

        Object dog = new Dogs();
     //  ((Dog) dog).eat();

        Dogs  realDog = (Dogs) dog;
        realDog.ruff();

        // Instance of

        Dogs doggy = new Dogs();
        if(doggy instanceof Animals)
        {
            Animals animal = (Animals) doggy;
            animal.sleep();
            // here we casted doggy to animal, variable animal doesn't have all Dogs methods, except the one overriden from abstract class
        }
        doggy.sleep();


    }
}
