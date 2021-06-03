package LeetCode.easyGT60;

import java.util.Arrays;

/**
 * Example 1:
 *
 * Input: nums = [1,2,3]
 * Output: 3
 * Explanation: Only three moves are needed (remember each move increments two elements):
 * [1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
 * Example 2:
 *
 * Input: nums = [1,1,1]
 * Output: 0
 * */

public class MinMoves {

    public static int minMoves(int[] nums) {
        Arrays.sort(nums);
    int moveCount=0;

    int n = nums.length;

      for(int i=n-1;i>=0;i--){
          moveCount += nums[i]-nums[0];
      }

    return moveCount;
    }


    public static void main(String[]args){

        int[]nums = {1,2,3};

        System.out.println(minMoves(nums));

    }
}
