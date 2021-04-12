package LeetCode.easyGT60;

import java.util.Arrays;

/**
 * Input: nums = [1,2,3,4]
 * Output: [2,4,4,4]
 * Explanation: The first pair [1,2] means we have freq = 1 and val = 2 so we generate the array [2].
 * The second pair [3,4] means we have freq = 3 and val = 4 so we generate [4,4,4].
 * At the end the concatenation [2] + [4,4,4] is [2,4,4,4].
 *
 * Input: nums = [1,1,2,3]
 * Output: [1,3,3]
 * */


public class DecompressRLElist {

    public static int[] decompressRLElist(int[] nums) {
      int len = 0;

        for(int i=0;i<nums.length;i +=2){
            len +=nums[i];
        }

        int[]arr = new int[len];
        int startidx = 0;

        for(int i=0;i<nums.length;i += 2){
            Arrays.fill(arr,startidx,startidx+nums[i],nums[i+1]);
            startidx += nums[i];
        }
        return arr;

    }

    public static void main(String[]args){
        int[]nums = {1,2,3,4};

        System.out.println(Arrays.toString(decompressRLElist(nums)));
    }
}
