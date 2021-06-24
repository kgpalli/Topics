package LeetCode.easyGT60;

/**
 * 643. Maximum Average Subarray I
 * Example 1:
 *
 * Input: nums = [1,12,-5,-6,50,3], k = 4
 * Output: 12.75000
 * Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
 * Example 2:
 *
 * Input: nums = [5], k = 1
 * Output: 5.00000
 * */

public class FindMaxAverage {
    public static double findMaxAverage(int[] nums, int k) {

       double sum =0;
       for(int i=0;i<k;i++){
           sum += nums[i];
       }

        double len =sum;
       for(int i=k;i<nums.length;i++){
          
           sum += nums[i]-nums[i-k];
           len = Math.max(sum,len);
       }


       return len/k;

    }


    public static void main(String[]args){
        int[]nums = {1,12,-5,-6,50,3};
        int k = 4;

        System.out.println(findMaxAverage(nums,k));

    }
}
