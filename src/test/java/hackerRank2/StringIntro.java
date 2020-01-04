package hackerRank2;

import java.util.Scanner;

/*
* Result : Hello
Java
9
No
Hello Java
compareTo() method is used to perform natural sorting on string.
returns < 0 then the String calling the method is lexicographically first
returns == 0 then the two strings are lexicographically equivalent
returns > 0 then the parameter passed to the compareTo method is lexicographically first.

* */

public class StringIntro {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String B = sc.next();
       System.out.println((a+B).length());
       System.out.println(a.compareTo(B)>0?"Yes":"No");


       System.out.println(a.substring(0,1).toUpperCase()+a.substring(1) + " " + B.substring(0,1).toUpperCase()+B.substring(1));









    }
}
