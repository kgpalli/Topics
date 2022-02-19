package LeetCode.set5;

import java.text.CollationElementIterator;
import java.util.*;

/**
 *
 * 819. Most Common Word
 * Example 1:
 *
 * Input: paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.", banned = ["hit"]
 * Output: "ball"
 * Explanation:
 * "hit" occurs 3 times, but it is a banned word.
 * "ball" occurs twice (and no other word does), so it is the most frequent non-banned word in the paragraph.
 * Note that words in the paragraph are not case sensitive,
 * that punctuation is ignored (even if adjacent to words, such as "ball,"),
 * and that "hit" isn't the answer even though it occurs more because it is banned.
 * Example 2:
 *
 * Input: paragraph = "a.", banned = []
 * Output: "a"
 *
 * "a, a, a, a, b,b,b,c, c"
 * ["a"]
 *
 * */

public class MostCommonWord {

    public static String mostCommonWord(String paragraph, String[] banned) {
        String str = paragraph.replaceAll("[^a-zA-Z0-9 ]","").toLowerCase();
        String[]words = str.split("\\s");
        Set<String> bannedWords = new HashSet<>();
        for(String word : banned){
            bannedWords.add(word);
        }

        HashMap<String,Integer>map = new HashMap<>();
        for(String s : words){
            if(!bannedWords.contains(s)){
                map.put(s,map.getOrDefault(s,0)+1);
            }
        }
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }


    public static void main(String[]args){
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit";
        String[]banned = {"hit"};

        System.out.println(mostCommonWord(paragraph,banned));


    }

}
