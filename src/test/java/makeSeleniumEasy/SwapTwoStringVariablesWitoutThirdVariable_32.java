package makeSeleniumEasy;

public class SwapTwoStringVariablesWitoutThirdVariable_32 {

    public static void main(String[] args) {

String s1 = "Selenium";
String s2 = "Java";

// Concatenate value of S2 with S1. Note here that value of S2 will be changed.
        s1 = s1 + s2;
        /* The swap value of S2 will start from zeroth index in concatenated string. End index will be
         total length of concatenated string minus length of S2 */


        s2 = s1.substring(0, (s1.length() - s2.length()));


       /* The swap value of S1 will be starting at the end of length of swap value of S2 in concatenated
         string S1.*/

        s1 = s1.substring(s2.length()); // it starts from java

        System.out.println("After swaping ");
        System.out.println("s1 value is : " + s1);

        System.out.println("s2 value is : " + s2);










    }



}
