package LeetCode.easyGT60;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * 645. Set Mismatch
 * Example 1:
 *
 * Input: nums = [1,2,2,4]
 * Output: [2,3]
 * Example 2:
 *
 * Input: nums = [1,1]
 * Output: [1,2]
 *
 * Input: [2,2]
 * Expected:
 * [2,1]
 * */

public class FindErrorNums {

    public static int[] findErrorNums(int[] nums) {

        int missing=0;
        int duplicate=0;

        for(int i=1;i<=nums.length;i++){
            int count=0;
            for (int num : nums) {

                if (num == i) {
                    count++;
                }
            }
                if (count == 2)
                    duplicate = i;
                 else if (count == 0) {
                    missing = i;
                }


        }
        return new int[]{duplicate,missing};

    }


    public static void main(String[]args){

    int[]nums = {1,2,2,4};
    System.out.println(Arrays.toString(findErrorNums(nums)));

    }
}
