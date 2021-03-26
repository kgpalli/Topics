package LeetCode.easy1_30;

/**
 * A string is represented by an array if the array elements concatenated in order forms the string.
 *Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
 * Output: true
 * Explanation:
 * word1 represents string "ab" + "c" -> "abc"
 * word2 represents string "a" + "bc" -> "abc"
 * The strings are the same, so return true
 *
 * Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
 * Output: false
 * */

public class TwoStringsEqual_1662 {

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = "";
        String s2="";
        if(word1.length>0) {
            for (String s : word1) {
                s1 += s;
            }
        }else s1 = word1[0];

        if(word2.length>0) {
            for (String s : word2) {
                s2 += s;
            }
        }else s2 = word2[0];

        return s1.equals(s2);
    }

    public static void main(String[]args){
        String[]word1 ={"abc", "d", "defg"};
        String[]word2 = {"abcddefg"};


        System.out.println(arrayStringsAreEqual(word1,word2));
    }
}
