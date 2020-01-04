package hackerRank2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/*
* a=hello
* b=hello
* Result = anagrams
*
*
*
* */

public class AreAnagrams {
    static boolean isAnagram(String a, String b) {

//   Pattern - 1 test for invalid input

        /*if(a==null || b==null || a.equals(" ") || b.equals(" "))
        {
            throw new IllegalArgumentException();
        }

        // initial quick test for non-anagrams
        if(a.length() != b.length())
        {
            return false;
        }

        a = a.toLowerCase();
        b = b.toLowerCase();

        Map<Character,Integer>map = new HashMap<>();

        for(int k = 0; k < b.length(); k++)

            {
                char letter = b.charAt(k);

                if( ! map.containsKey(letter)){
                    map.put( letter, 1 );

                } else {
                    Integer frequency = map.get( letter );
                    map.put( letter, ++frequency );
                    System.out.println("map 1 " + map);
                }
            }
// test each letter in String a against data in the map
// return if letter is absent in the map or its  frequency is 0
// otherwise decrease the frequency by 1

        for (int k = 0; k < a.length(); k++){
            char letter = a.charAt(k);

            if( ! map.containsKey( letter ) )
                return false;

            Integer frequency = map.get( letter );


            if( frequency == 0 )
                return false;
            else
                map.put(letter,--frequency);
            System.out.println("map 2 " + map);
        }
// if the code got that far it is an anagram
        return true;*/

        // Pattern = 2

/*Now we compare the occurances of each character in both the arrays. If any occurance is not equal then we return False.
When all the occurances were same and for loop terminates , then we reutrn True.
* */
        if(a.length() != b.length())
            return false;
        int c[] = new int[250], d[] = new int[250]; // or int c[] = new int[26], d[] = new int[26]

        a = a.toUpperCase();
        b = b.toUpperCase();
// here letters give their ASCII values, to avoid index out of bounds exception ,
// we need to subtract from ASCII value of 'A " , so , it will fit with in 26, A = 65
        for(int i=0;i<a.length();i++)
        {
            c[a.charAt(i) ]++;  // c[a.charAt(i)-'A']++
            d[b.charAt(i) ]++; // d[b.charAt(i)- 'A' ]++

        }
        for(int i=0;i<250;i++)   // for(int i=0;i<26;i++)
        {
            if(c[i] != d[i])
                return false;

        }

        return true;
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
