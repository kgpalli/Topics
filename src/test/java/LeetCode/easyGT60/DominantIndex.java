package LeetCode.easyGT60;

import java.util.Arrays;

/**
 * Example 1:
 *
 * Input: nums = [3,6,1,0]
 * Output: 1
 * Explanation: 6 is the largest integer.
 * For every other number in the array x, 6 is at least twice as big as x.
 * The index of value 6 is 1, so we return 1.
 * Example 2:
 *
 * Input: nums = [1,2,3,4]
 * Output: -1
 * Explanation: 4 is less than twice the value of 3, so we return -1.
 * Example 3:
 *
 * Input: nums = [1]
 * Output: 0
 * Explanation: 1 is trivially at least twice the value as any other number because there are no other numbers.
 * */

public class DominantIndex {

    public static int dominantIndex(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        int max = Integer.MIN_VALUE;
        for(int i : nums){
            max = Math.max(max,i);
        }
        int index=0;
        for (int i=0;i<nums.length;i++) {
            if(nums[i]==max){
                index=i;
                 continue;
            }
                int j = nums[i] * 2;
                if (!(j <= max)) {
                    return -1;
                }

        }

        return index;
    }


    public static void main (String[]args){

        int [] nums = {0,0,0,1};

        System.out.println(dominantIndex(nums));

    }
}
