package LeetCode.easyGT60;
/**
 * Example 1:
 *
 * Input: s = "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 * Example 2:
 *
 * Input: s = "God Ding"
 * Output: "doG gniD"
 *
 *
 * */

public class ReverseWordsInString {

    public static String reverseWords(String s) {

        String[]words = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {

            for (int j = word.length() - 1; j >= 0; j--) {
                char ch = word.charAt(j);
                sb.append(ch);
            }
            sb.append(" ");
        }
       return sb.toString().trim();


    }

    public static void main(String[]args){

        String s = "Let's take LeetCode contest";

        System.out.println(reverseWords(s));
    }



}
