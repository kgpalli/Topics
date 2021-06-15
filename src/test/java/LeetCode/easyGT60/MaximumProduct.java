package LeetCode.easyGT60;

import java.util.Arrays;

/**
 * 628. Maximum Product of Three Numbers
 * Example 1:
 *
 * Input: nums = [1,2,3]
 * Output: 6
 * Example 2:
 *
 * Input: nums = [1,2,3,4]
 * Output: 24
 * Example 3:
 *
 * Input: nums = [-1,-2,-3]
 * Output: -6
 *
 * [-100,-98,-1,2,3,4]
 * Expected:
 * 39200
 *
 * */

public class MaximumProduct {

    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        return Math.max(nums[0] * nums[1] * nums[nums.length - 1],
                nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]);

       /* if(nums.length==1 ){
            return nums[0];
        }
        int sum=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            sum = sum * nums[i];

        }

    return sum;*/
    }


    public static void main(String[]args){
        int[]nums = {-1,-2,-3};


    System.out.println(maximumProduct(nums));

    }
}
