package hackerRank2;


import java.util.*;


public class Practice {

    static boolean isAnagram(String a, String b) {

        int count =0;
       a = a.toLowerCase();
       b = b.toLowerCase();
      if(a.length()==b.length())
      {
          return true;
      }
         return false;


        }



    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
       String a = scan.next();
       String b = scan.next();
       scan.close();


boolean ret = isAnagram(a,b);

System.out.println((ret)? "Anagrams":"Not Anagrams");



   }

   }






