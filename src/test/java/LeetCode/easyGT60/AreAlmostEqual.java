package LeetCode.easyGT60;
/**
 * Input: s1 = "bank", s2 = "kanb"
 * Output: true
 * Explanation: For example, swap the first character with the last character of s2 to make "bank".
 *Input: s1 = "attack", s2 = "defend"
 * Output: false
 * Explanation: It is impossible to make them equal with one string swap.
 *
 * */

public class AreAlmostEqual {

    public static boolean areAlmostEqual(String s1, String s2) {

        /*int count=0;
        int i=0;
        while(i<s1.length()){
            if(s1.charAt(i)!=s2.charAt(i))
                count++;
            i++;
        }
        System.out.println(count);

        return count==0 || count==2;*/

        int index1=-1; int index2=-1;

        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                if(index1==-1)
                    index1=i;
                else if(index2==-1)
                    index2=i;
                else return false;
            }
        }
        if (index1 < 0 && index2 < 0) return true;
        if (index2 < 0) return false;
        if (s1.charAt(index1) == s2.charAt(index2) && s1.charAt(index2) == s2.charAt(index1))return true;
        return false;
    }

    public static void main(String[]args){
        String s1 = "bank";
        String s2 = "kanb";
        System.out.println(areAlmostEqual(s1,s2));

    }
}
