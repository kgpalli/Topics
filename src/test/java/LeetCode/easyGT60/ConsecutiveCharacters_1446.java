package LeetCode.easyGT60;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


/**
 * Given a string s, the power of the string is the maximum length of a non-empty substring that contains only one unique character.
 * 	Input: s = "leetcode"   Output: 2
 * Explanation: The substring "ee" is of length 2 with the character 'e' only.
 * 	Input: s = "abbcccddddeeeeedcba"  Output: 5
 * Explanation: The substring "eeeee" is of length 5 with the character 'e' only.
 * */

public class ConsecutiveCharacters_1446 {
    public static int maxPower(String s) {
        int count = 0;
        int maxCount = 0;
        char previous = ' ';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == previous) {
                // if same as previous one, increase the count
                count++;
            } else {
                // else, reset the count
                count = 1;
                previous = c;
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }

    public static void main(String[]args){
        String s="abbcccddddeeeeedcba";

     System.out.println(maxPower(s));


    }
}
