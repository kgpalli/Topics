package LeetCode.easyGT60;

import java.util.Arrays;

/**
 * 1920. Build Array from Permutation
 * Example 1:
 *
 * Input: nums = [0,2,1,5,3,4]
 * Output: [0,1,2,4,5,3]
 * Explanation: The array ans is built as follows:
 * ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
 *     = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
 *     = [0,1,2,4,5,3]
 * Example 2:
 *
 * Input: nums = [5,0,1,2,3,4]
 * Output: [4,5,0,1,2,3]
 * Explanation: The array ans is built as follows:
 * ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
 *     = [nums[5], nums[0], nums[1], nums[2], nums[3], nums[4]]
 *     = [4,5,0,1,2,3]
 *
 *
 * */

public class BuildArrayFromPermutation {

    public static int[] buildArray(int[] nums) {
        int[]newArr = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            newArr[i] = nums[nums[i]];
        }
       return newArr;
    }




    public static void main(String[]args){
        int[]arr = {5,0,1,2,3,4};

        System.out.println(Arrays.toString(buildArray(arr)));


    }



}
