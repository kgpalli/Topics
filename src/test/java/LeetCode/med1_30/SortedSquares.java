package LeetCode.med1_30;

import java.util.Arrays;

/**
 * Example 1:
 *
 * Input: nums = [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Explanation: After squaring, the array becomes [16,1,0,9,100].
 * After sorting, it becomes [0,1,9,16,100].
 * Example 2:
 *
 * Input: nums = [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 *
 * */

public class SortedSquares {
    public static int[] sortedSquares(int[] nums) {
        int[]sortedArray = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            sortedArray[i] = nums[i]*nums[i];

        }
        Arrays.sort(sortedArray);

        return sortedArray;

    }




    public static void main(String[]args){
        int[]nums = {-4,-1,0,3,10};

        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
}
