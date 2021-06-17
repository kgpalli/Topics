package LeetCode.easyGT60;

import java.util.*;
/**
 * 594. Longest Harmonious Subsequence
 * Example 1:
 *
 * Input: nums = [1,3,2,2,5,2,3,7]
 * Output: 5
 * Explanation: The longest harmonious subsequence is [3,2,2,2,3].
 * Example 2:
 *
 * Input: nums = [1,2,3,4]
 * Output: 2
 * Example 3:
 *
 * Input: nums = [1,1,1,1]
 * Output: 0
 * */

public class FindLHS {

    public  static int findLHS(int[] nums) {
       int result=0;
       Map<Integer,Integer>map = new HashMap<>();

       for(int i:nums){
           map.put(i,map.getOrDefault(i,0)+1);
       }

       for(int i : map.keySet()){
           if(map.containsKey(i+1)){
               result = Math.max(result,map.get(i)+map.get(i+1));
           }
       }
       return result;
    }

    public static void main(String[]args){
        int [] nums = {1,3,2,2,5,2,3,7};
        System.out.println(findLHS(nums));
    }
}
