package LeetCode.easy30_60;

/**
 * Given an array nums of 0s and 1s and an integer k,
 * return True if all 1's are at least k places away from each other, otherwise return False.
 * Input: nums = [1,0,0,0,1,0,0,1], k = 2   Output: true
 * Explanation: Each of the 1s are at least 2 places away from each other.
 * Input: nums = [1,0,0,1,0,1], k = 2   Output: false
 * Explanation: The second 1 and third 1 are only one apart from each other.
 *
 * */

public class KLengthApart {

    public static boolean kLengthApart(int[] nums, int k) {
        int count = k;
        for (int num : nums) {
            // if the current integer is 1
            if (num == 1) {
                // check that number of zeros in-between 1s
                // is greater than or equal to k
                if (count < k) {
                    return false;
                }
                // reinitialize counter
                count = 0;

                // if the current integer is 0
            } else {
                // increase the counter

                ++count;
                System.out.println("Count is + " + count);
            }
        }

        return true;
    }


    public static void main(String[]args){

        int[]nums = {1,0,0,0,1,0,0,1};
        int k = 2;

 System.out.println(kLengthApart(nums,k));
    }
}
