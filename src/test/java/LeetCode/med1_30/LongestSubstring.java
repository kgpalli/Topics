package LeetCode.med1_30;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a string s, find the length of the longest substring without repeating characters.
 *Input: s = "abcabcbb",   Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * */

public class LongestSubstring {

    public static int lengthOfLongestSubstring(String s) {

        Set<Character> set = new HashSet<>();

        int a_pointer=0;
        int b_pointer = 0;
        int max=0;

        while(b_pointer<s.length())
        {
            char ch = s.charAt(b_pointer);
            if(!set.contains(ch)){
                set.add(ch);
                b_pointer++;
                max = Math.max(set.size(),max);

            }else{
                set.remove(s.charAt(a_pointer));
                a_pointer++;
            }
        }
        System.out.println(max);
        return max;

    }


    public static void main(String[]args){
        String s = "abcabcbb";

        lengthOfLongestSubstring(s);

    }
}
