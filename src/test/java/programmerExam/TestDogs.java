package programmerExam;

import java.util.ArrayList;
import java.util.function.Predicate;

// Learn Lambda1 expression

public class TestDogs {
    public static void main(String[] args) {

        ArrayList<Dog> dog = new ArrayList<>(); // create and populate
        dog.add(new Dog("boi",10,6));
        dog.add(new Dog("charis",120,7));
        dog.add(new Dog("clover",35,12));
        dog.add(new Dog("zooey",45,8));
        dog.add(new Dog("aiko",50,10));
        dog.add(new Dog("pup",11,5));
        dog.add(new Dog("mia",15,4));

        System.out.println("All dogs : " + dog);     // run a few quiries
        System.out.println("minAge is = " + minAge(dog,7).toString());
        System.out.println("maxWeight is = " + maxWeight(dog,40).toString());

        System.out.println("Dogs age < 9 = " + dogQuery(dog,d -> d.getAge()<9).toString());
        System.out.println("Dogs weighing > 100  " + dogQuery(dog,d -> d.getWeight()>100).toString());





        }


    static ArrayList<Dog>minAge(ArrayList<Dog>dogList, int testFor)   // decalre few query methods
    {
        ArrayList<Dog>result1 = new ArrayList<>();

        for(Dog d : dogList)    // the key moment
        {
            if(d.getAge()>=testFor)
            result1.add(d);
        }
        return result1;
    }

    static ArrayList<Dog>maxWeight(ArrayList<Dog>dogList, int testFor)
    {
        ArrayList<Dog>result1 = new ArrayList<>();   // the key moment

        for(Dog d : dogList)
        {
            if(d.getWeight()<=testFor)
                result1.add(d);
        }
        return result1;
    }

    // creating Lambda1 expression using java.util.function package and interfaces of that package

    static ArrayList<Dog>dogQuery(ArrayList<Dog>dogList, Predicate<Dog>expr)  // using Lambda1 expression
    {
        ArrayList<Dog>result1 = new ArrayList<>();   // the key moment

        for(Dog d : dogList)
        {
            if(expr.test(d))
                result1.add(d);
        }
        return result1;
    }

}
