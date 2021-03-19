package LeetCode.easy30_60;

/**
 * We usually follow Base 10 representation with numbers 0 to 9
 * Base 7 has 0 to 6 representation
 * Given an integer, return its base 7 string representation.
 * 	Input: 100.  Output: "202"
 *  Example 2:   Input: -7.   Output: "-10"
 * */

public class Base7 {

    public static String convertToBase7(int num) {

        String s="";
        int copy=num;
        if(num <0)
            num = Math.abs(num);
        StringBuilder sb = new StringBuilder();

        while(num>0){
            int rem = num % 7;
            num /= 7;
            sb.append(s+String.valueOf(rem));
        }

    if(copy <0){
        return "-" + sb.reverse().toString();
    }
    return sb.reverse().toString();

    }

    public static void main(String[]args){
     int num = -7;

        System.out.println(convertToBase7(num));


    }

}
