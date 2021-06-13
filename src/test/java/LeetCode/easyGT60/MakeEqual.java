package LeetCode.easyGT60;

import java.util.HashMap;
import java.util.Map;

/**
 * 1897. Redistribute Characters to Make All Strings Equal
 * Example 1:
 *
 * Input: words = ["abc","aabc","bc"]
 * Output: true
 * Explanation: Move the first 'a' in words[1] to the front of words[2],
 * to make words[1] = "abc" and words[2] = "abc".
 * All the strings are now equal to "abc", so return true.
 * Example 2:
 *
 * Input: words = ["ab","a"]
 * Output: false
 * Explanation: It is impossible to make all the strings equal using the operation.
 * */


public class MakeEqual {


    public static boolean makeEqual(String[] words) {
             int len = words.length;
        Map<Character,Integer> map = new HashMap<>();

        for (String word : words) {
            for (int j = 0; j < word.length(); j++) {
                map.put(word.charAt(j), map.getOrDefault(word.charAt(j), 0)+1);
            }
        }

        for(Map.Entry<Character,Integer>entry : map.entrySet()){
            int count=entry.getValue();
            if(count%len != 0){
                return false;
            }

        }
        return true;

    }

    public static void main(String[]args){
        String[]words = {"abc","aabc","bc"};

        System.out.println(makeEqual(words));
    }
}
