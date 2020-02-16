package hackerRank2.abstractPr;

import java.util.Scanner;

public class AbstractPr {

    //output :  The title is: A tale of two cities

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String title = sc.nextLine();
        MyBook new_novel = new MyBook();
        new_novel.setTitle(title);

        System.out.println("The title is: " +new_novel.getTitle());
        sc.close();
    }
}

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String   getTitle(){
        return title;

    }
}

class MyBook extends Book{
    // error : Class 'MyBook' must either be declared abstract or implement abstract method 'setTitle(String)' in 'Book', class extending abstrace class must define all declared methods, else it must declare it self as abstract class

    @Override
    void setTitle(String s) {
       title = s; // it adds the valur of s to titile variable
    }
}
