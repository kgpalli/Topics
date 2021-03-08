package LeetCode.easy1_30;

/**
 * Add Digits:  Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 * Input: 38
 * Output: 2
 * Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2.
 *              Since 2 has only one digit, return
 *
 *
 * */

public class AddDigits {
    public static int addDigits(int num) {
        if(num==0){
            return 0;
        }else if(num%9==0){
            return 9;
        }

      return num%9;
    }


    public static void main(String[]args){

        System.out.println(addDigits(158));

    }

}
