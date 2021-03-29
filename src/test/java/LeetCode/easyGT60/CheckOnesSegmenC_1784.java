package LeetCode.easyGT60;

/**
 * Given a binary string s without leading zeros,
 * return true if s contains at most one contiguous segment of ones. Otherwise, return false
 *Input: s = "1001"   Output: false
 * Explanation: The ones do not form a contiguous segment.
 * Input: s = "110"   Output: true, Input s = "1000" Output= true
 * */

public class CheckOnesSegmenC_1784 {
    public static boolean checkOnesSegment(String s) {
        if(s.length()==1 && s.contains("1")) return true;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)=='1' && s.charAt(i-1)=='0')
                return false;
        }
        return true;
    }


    public static void main (String[]args){
        String s = "110";
        System.out.println(checkOnesSegment(s));

    }

}
