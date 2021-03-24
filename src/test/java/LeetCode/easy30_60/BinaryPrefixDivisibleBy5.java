package LeetCode.easy30_60;

import java.util.ArrayList;
import java.util.List;
/**
 * Given an array A of 0s and 1s, consider N_i: the i-th subarray from
 * Input: [0,1,1]   Output: [true,false,false]
 * Explanation:
 * The input numbers in binary are 0, 01, 011; which are 0, 1, and 3 in base-10.
 * Only the first number is divisible by 5, so answer[0] is true
 * Input: [1,1,1]    Output: [false,false,false]
 * */

public class BinaryPrefixDivisibleBy5 {

    public static List<Boolean> prefixesDivBy5(int[] A) {

        List<Boolean> list = new ArrayList<>();
        int num = A[0];
        boolean first = num % 5 == 0;
        list.add(first);

        for(int i=1;i<A.length ;i++){
            if(A[i]==1){
                num = num*2+1;
            }else
                num = num * 2;
            if(num % 5 == 0) list.add(true);
            if(num % 5 != 0) list.add(false);

            num =num % 5;
        }
        return list;

    }


    public static void main(String[]args){
        int[]A = {0,1,1,1,1,1};

        System.out.println(prefixesDivBy5(A));
    }
}
