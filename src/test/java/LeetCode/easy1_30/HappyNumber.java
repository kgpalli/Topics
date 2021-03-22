package LeetCode.easy1_30;

import java.util.HashSet;
/**
 * Those numbers for which this process ends in 1 are happy.
 * 	Input: n = 19
 * Output: true
 * Explanation:
 * 1*1 + 9*9 = 82
 * 8*8 + 2*2 = 68
 * 6*6 + 8*8 = 100
 * 1*1 + 0*8 + 02 = 1
 *
 * */

public class HappyNumber {


    public static boolean isHappy(int n) {

        HashSet<Integer> seen = new HashSet<>();

        while(n != 1){
            int current = n;
            int sum=0;
            while(current != 0){
                sum += (current % 10) * (current % 10);
                current /= 10;
            }

            if(seen.contains(sum)){
                return false;
            }
            seen.add(sum);
            n=sum;
        }
        return true;

    }

    public static void main(String[]args){
        int num = 3;
        System.out.println(isHappy(num));
    }
}
