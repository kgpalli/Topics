package hackerRank2;

import java.util.Scanner;
/* Print lexicographical presentation
* hellojava
*3 7
*Ans 1: smallest = ava  , largest = oja
* */

public class CompareSubString {

    public static String getSmallestAndLargest(String s, int k) {
        /*String smallest = "";
        String largest = "";*/

        String  smallest = s.substring(0, k);
        String largest = "";
        for (int i = 0; i < s.length() - 2; i++) { // s.length() - k + 1 = 9
            if (s.substring(i, i + k).compareTo(smallest) < 0) smallest = s.substring(i, i + k);
            if (s.substring(i, i + k).compareTo(largest) > 0) largest = s.substring(i, i + k);


        }

        return smallest + "\n" + largest;
    }


    public static void main(String args[]) {

      /*Scanner sc = new Scanner(System.in);

      String value = sc.next();
      int startString = sc.nextInt();*/
        // int endString = sc.nextInt();

/*

      String result = value.substring(startString,endString );

      System.out.println(result);
*/

      /*String result1 = value.substring(value.length()-startString);
      System.out.println(result1);


      String result2 = value.substring(0,startString);
      System.out.println(result2);*/

        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));



    }
}
