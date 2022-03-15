package LeetCode.easy30_60;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/**
 * 349. Intersection of Two Arrays
 * Example 1:
 *
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2]
 * Example 2:
 *
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [9,4]
 * Explanation: [4,9] is also accepted.
 *
 * */

public class IntersectionOfArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer>set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int i: nums1){
            set1.add(i);
        }
        for(int j: nums2){
            if(set1.contains(j)){
                set2.add(j);
            }
        }

        int[]nums = new int[set2.size()];
        int index=0;
        for(int i:set2){
            nums[index++] = i;
        }

        return nums;

    }

public static void main (String[]args){

        int []nums1 = {1,2,2,1};
        int []nums2 = {2,2};

        System.out.println(Arrays.toString(intersection(nums1,nums2)));

}



}
