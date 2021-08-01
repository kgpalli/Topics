package LeetCode.easyGT60;
/**
 * Example 1:
 *
 * Input: target = 7, nums = [2,3,1,2,4,3]
 * Output: 2
 * Explanation: The subarray [4,3] has the minimal length under the problem constraint.
 * Example 2:
 *
 * Input: target = 4, nums = [1,4,4]
 * Output: 1
 * Example 3:
 *
 * Input: target = 11, nums = [1,1,1,1,1,1,1,1]
 * Output: 0
 *
 * */

public class MinSubArrayLen {

    public static int minSubArrayLen(int target, int[] nums) {
        int minLen=Integer.MAX_VALUE;
        int left=0;
        int value_sum=0;

        for(int i=0;i<nums.length;i++){
            value_sum += nums[i];
           while(value_sum>=target){
               minLen = Math.min(minLen,i+1-left);
               value_sum -= nums[left];
               left++;
            }

        }
        return minLen == Integer.MAX_VALUE ? 0:minLen;

    }


    public static void main(String[]args){

        int[]nums = {2,3,1,2,4,3};
        int target = 7;

        System.out.println(minSubArrayLen(target,nums));



    }
}
