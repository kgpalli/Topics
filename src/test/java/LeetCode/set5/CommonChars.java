package LeetCode.set5;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

/**
 * 1002. Find Common Characters
 * Example 1:
 *
 * Input: words = ["bella","label","roller"]
 * Output: ["e","l","l"]
 * Example 2:
 *
 * Input: words = ["cool","lock","cook"]
 * Output: ["c","o"]
 * */
public class CommonChars {

    public static List<String> commonChars(String[] words) {

        List<String>common_chars =  new ArrayList<>();

        int[]min_freq = new int[26];
        Arrays.fill(min_freq,Integer.MAX_VALUE);

        for(String current_string : words){
            int[]char_freq = new int[26];
            for(char c : current_string.toCharArray()){
                char_freq[c-'a']++;
            }
            for(int i=0;i<26;i++){
                min_freq[i] =Math.min(min_freq[i],char_freq[i]);
            }
        }

        for(int i=0;i<26;i++){
            while (min_freq[i]>0) {
                common_chars.add("" + (char) (i + 'a'));
                min_freq[i]--;
            }
        }

        return common_chars;

    }


    public static void main(String[]args){

        String[]words = {"cool","lock","cook"};
        System.out.println(commonChars(words));


    }
}
