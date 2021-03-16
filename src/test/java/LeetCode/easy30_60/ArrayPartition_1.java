package LeetCode.easy30_60;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Given an integer array nums of 2n integers, group these integers into n pairs (a1, b1), (a2, b2), ...,
 * (an, bn) such that the sum of min(ai, bi) for all i is maximized. Return the maximized sum.
 * Input: nums = [1,4,3,2]
 * Output: 4
 * Input = {6,2,6,5,1,2}, output = 6, sort the array and take sum of every 2nd element
 * */

public class ArrayPartition_1 {

    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        System.out.print("Array after sorting + " + Arrays.toString(nums));
        int sum=0;

        for(int i=0;i<nums.length-1;i = i+2){
            sum +=nums[i];
        }

      System.out.println();
        return sum;

    }



    public static void main (String[]args){

        int [] nums = {6214, -2290, 2833, -7908};



        System.out.println(arrayPairSum(nums));

    }

}
