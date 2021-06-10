package LeetCode.easyGT60;

/**
 * Example 1:
 *
 * Input: s = "abcdefg", k = 2
 * Output: "bacdfeg"
 * Example 2:
 *
 * Input: s = "abcd", k = 2
 * Output: "bacd"
 * */

public class ReverseStrII {

    public static String reverseStr(String s, int k) {

        char[]ch = s.toCharArray();
        for(int start=0;start<ch.length; start+= 2*k){

                int i=start, j = Math.min(start + k-1, ch.length-1);
                while(i<j){
                    char tmp = ch[i];
                    ch[i++] = ch[j];
                    ch[j--] = tmp;
                }
        }
        return new String(ch);

    }

    public static void main(String[]args){
        String s = "abcd";
        int k=2;

        System.out.println(reverseStr(s,k));

    }

}
