package hackerrank;

public class Animal {
    private int age;  // if it's prvate can be accessible only with in the class

    public Animal(int age)
    {
        this.age=age;
        System.out.println("1 + Animal has been created");
    }
    public void eat()
    {
        System.out.println(" 1 + Animal is eating");
    }

    public int getAge()
    {
        return age;
    }

    public static void main(String[] args) {

        Animal a = new Animal(5);
        Dog d = new Dog();
        Cat c = new Cat();
        System.out.println(d.getAge()); // getters make age variable handy
        System.out.println(c.getAge());
        d.ruff();
        d.run();
        c.meow();
        c.prance();
        a.eat();
        d.eat();
        c.eat();







    }



}
