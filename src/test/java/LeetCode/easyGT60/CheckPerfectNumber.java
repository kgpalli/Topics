package LeetCode.easyGT60;
/**
 * Example 1:
 *
 * Input: num = 28
 * Output: true
 * Explanation: 28 = 1 + 2 + 4 + 7 + 14
 * 1, 2, 4, 7, and 14 are all divisors of 28.
 * Example 2:
 *
 * Input: num = 6
 * Output: true
 * Example 3:
 *
 * Input: num = 496
 * Output: true
 * Example 4:
 *
 * Input: num = 8128
 * Output: true
 * Example 5:
 *
 * Input: num = 2
 * Output: false
 *
 * */

public class CheckPerfectNumber {

    public static boolean checkPerfectNumber(int num) {

        if(num<=0){
            return false;
        }

        int halfNum = num/2;
        int sum_of_devisor=0;

        for(int i=1;i<=halfNum;i++){
            if(num%i==0){
                sum_of_devisor +=i;
            }
        }

        return sum_of_devisor==num;

    }


    public static void main(String[]args){
        int num = 496;

        System.out.println(checkPerfectNumber(num));

    }
}
