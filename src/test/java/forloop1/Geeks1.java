package forloop1;

public class Geeks1 {
    public static void main(String[] args) {
        int i1 = 0;
        for (int i = 0; i < 10; i++)
             //int x = 10;


    /*Curly braces are optional and without curly braces we can take only one statement
    under for loop which should not be declarative statement. Here we are declaring a variable
    that’s why we will get compile time error saying error: variable declaration not allowed here.*/

        // 2.  for (int i = 0, String = "GFG"; i < 2; i++) Result : incompatible -expected int found string and int
 /*Initialization part of the for loop will be executed only once in the for loop life cycle.Here we can declare any number
    of variables but should be of same type. By mistake if we are trying to declare differentdata types
    variables then we will get compile time error saying error: incompatible types: String cannot be converted to int*/



        for (System.out.println("HI"); i1 < 1; i1++)
            System.out.println("HELLO GEEKS");  // result :  HI   HELLO GEEKS

       /* I n the initialization section we can take any valid java statement including System.out.println(). In the for loop
        initialization section is executed only once that’s why here it will print first HI and after that HELLO GEEKS*/

        for (int i = 0; i < 1; System.out.println("WELCOME"))
            System.out.println("GEEKS");  // result : GEEKS WELCOME(Infinitely)
//In increment-decrement section we can take any valid java statement including System.out.println(). Here in the increment/decrement section, a statement is there, which result the program to go to infinite loop

        for (int i = 0;; i++)
            System.out.println("HELLO GEEKS");  // result :  HELLO GEEKS (Infinitely)

        /*In the conditional check we can take any valid java statement but should be of type Boolean.
                If we did not give any statement then it always returns true.*/
    }
}