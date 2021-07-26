package LeetCode.easyGT60;
/**
 * Example 1:
 *
 * Input: s = "abcde", goal = "cdeab"
 * Output: true
 * Example 2:
 *
 * Input: s = "abcde", goal = "abced"
 * Output: false
 *
 * */

public class RotateString {

    public static boolean rotateString(String s, String goal) {
        return s.length()==goal.length() && (s+s).contains(goal);

    }


    public static void main(String[]args){

        String s="abcde";
        String goal = "cdeab";

       System.out.println(rotateString(s,goal));


    }

}
