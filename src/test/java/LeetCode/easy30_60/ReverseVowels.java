package LeetCode.easy30_60;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 345. Reverse Vowels of a String
 * Example 1:
 *
 * Input: s = "hello"
 * Output: "holle"
 * Example 2:
 *
 * Input: s = "leetcode"
 * Output: "leotcede"
 * */

public class ReverseVowels {
    public static String reverseVowels(String s) {
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');

        char[]arr = s.toCharArray();
        int i=0,j=s.length()-1;

        while (i<j){
            while(i<j && !set.contains(arr[i]))i++;
            while(i<j && !set.contains(arr[j]))j--;

            char temp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = temp;

        }


    return String.valueOf(arr);

    }


    public static void main(String[]args){
        String s = "Aa";

        System.out.println(reverseVowels(s));


    }
}
