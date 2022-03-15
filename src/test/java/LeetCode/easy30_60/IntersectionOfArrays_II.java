package LeetCode.easy30_60;

import java.util.*;

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

public class IntersectionOfArrays_II {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer,Integer>map1 = new HashMap<>();
        Map<Integer,Integer>map2 = new HashMap<>();
        List<Integer>list = new ArrayList<>();


        for (int i: nums1){
            map1.put(i, map1.getOrDefault(i,0)+1);
        }
        for(int j: nums2){

            map2.put(j, map2.getOrDefault(j,0)+1);

        }

        for(Integer key : map1.keySet()){
            int min=0;
            if(map2.containsKey(key)){
                min = Math.min(map1.get(key),map2.get(key));
                System.out.println("Min is : " + min);
                while(min--> 0){
                    list.add(key);
                }
            }
        }

        int[]nums = new int[list.size()];
        int index=0;
        for(int i:list){
            nums[index++] = i;
        }

        return nums;

    }

public static void main (String[]args){

        int []nums1 = {1,2,2,1};
        int []nums2 = {2};

        System.out.println(Arrays.toString(intersection(nums1,nums2)));

}



}
