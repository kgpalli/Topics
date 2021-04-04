package LeetCode.med1_30;
/**
 * 1684. Count the Number of Consistent Strings
 * Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
 * Output: 2
 * Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.
 * Input: allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
 * Output: 7
 * Explanation: All strings are consistent.
 * */


public class SufficTrie {

    public static int countConsistentStrings(String allowed, String[] words) {

        int count =0;
        char[]allowed_chars = allowed.toCharArray();
        for(int i=0;i<words.length;i++){
            char ch1 = words[i].charAt(i);

        }





        return count;

    }




    public static void main (String[]args){

        String allowed = "ab";
        String[]words = {"ad","bd","aaab","baa","badab"};

        System.out.println(countConsistentStrings(allowed,words));

        
    }

}
