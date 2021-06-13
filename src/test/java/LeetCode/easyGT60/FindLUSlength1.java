package LeetCode.easyGT60;
/**
 * Example 1:
 *
 * Input: a = "aba", b = "cdc"
 * Output: 3
 * Explanation: One longest uncommon subsequence is "aba" because "aba" is a subsequence of "aba" but not "cdc".
 * Note that "cdc" is also a longest uncommon subsequence.
 * Example 2:
 *
 * Input: a = "aaa", b = "bbb"
 * Output: 3
 * Explanation: The longest uncommon subsequences are "aaa" and "bbb".
 * Example 3:
 *
 * Input: a = "aaa", b = "aaa"
 * Output: -1
 * Explanation: Every subsequence of string a is also a subsequence of string b. Similarly, every subsequence of string b is also a subsequence of string a.
 *
 *
 *
 * */

public class FindLUSlength1 {

    public static int findLUSlength(String a, String b) {
        int len=0;
        if(a.equals(b))return -1;

      return len = Math.max(a.length(),b.length());
    }


    public static void main(String[]args){

        String a = "aba";
        String b = "cdc";

        System.out.println(findLUSlength(a,b));



    }
}
