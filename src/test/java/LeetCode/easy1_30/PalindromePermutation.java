package LeetCode.easy1_30;

	/*Input : aab,  output: true
      Input: code , output: false*/

public class PalindromePermutation {

    public static boolean canPermutePalindrome(String s){
        int[]char_counts = new int[26];

        for(int i=0;i<s.length();i++){
            char_counts[s.charAt(i) - 'a']++;
        }

        int count=0;
        for(int i=0;i<26;i++){
            count += char_counts[i]%2;
        }
        return count <=1;

    }

    public static void main(String[]args){

    System.out.println(canPermutePalindrome("malayalamaaaa"));

    }
}
