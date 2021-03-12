package LeetCode.easy30_60;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 	For a non-negative integer X, the array-form of X is an array of its digits in left to right order.  For example, if X = 1231, then the array form is [1,2,3,1].
 * 	Given the array-form A of a non-negative integer X, return the array-form of the integer X+K
 *
 * 	Input: A = [1,2,0,0], K = 34.      Output: [1,2,3,4]
 * Explanation: 1200 + 34 = 1234
 * */

public class AddArrayFormToInteger {

    public static List<Integer> addToArrayForm(int[] A, int K) {

        List<Integer> list = new ArrayList<>();
        int N = A.length;
        int cur=K;

        int i=N;

        while(--i >=0 || cur>0){
            cur += A[i];
            list.add(cur%10);
            cur /= 10;
        }
        Collections.reverse(list);
        return list;

    }



    public static void main(String[]args){

     int[]A = {1,2,0,0};
     int k = 34;

       System.out.println(addToArrayForm(A,k).toString());

    }


}
