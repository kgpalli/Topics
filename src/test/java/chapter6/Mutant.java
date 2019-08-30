package chapter6;

public class Mutant {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("abc");
        System.out.println("sb is " +sb );
//sb is abc
        String s = ("abc");
        System.out.println("s is "+s);

        //s is abc


        sb.reverse().append("d");
        System.out.println("sb1 is " +sb);
        //sb1 is cbad


        s.toUpperCase().concat("d"); // lost

        System.out.println("."+ sb +". ." + s + ".");

        // answer .cbad. .abc.



char[] ca = {0x4e,'\u004e',78};
System.out.println(ca[0]); //N
System.out.println(ca[1]); //N
System.out.println((ca[0]==ca[1]) +" "+(ca[0]==ca[2])); // true true






    }




}
