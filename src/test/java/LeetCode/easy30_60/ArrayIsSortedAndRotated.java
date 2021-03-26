package LeetCode.easy30_60;
/**
 * Input: nums = [3,4,5,1,2]
 * Output: true
 * Explanation: [1,2,3,4,5] is the original sorted array.
 * You can rotate the array by x = 3 positions to begin on the the element of value 3: [3,4,5,1,2].
 *
 * */

public class ArrayIsSortedAndRotated {

    public static boolean check(int[] nums) {

        int count=0;

        for(int i=0;i<nums.length;i++){
            // => when i reaches last element i+1 & nums.length become equal,  mod become 0,
            // comparison is done between element at last index & first index
            if(nums[i]>nums[(i+1)%nums.length])
                count++;
            if(count>1)
                return false;
        }


        return true;
    }

    public static void main(String[]args){
        int[]nums = {3,4,5,1,2};

        System.out.println(check(nums));
    }
}
