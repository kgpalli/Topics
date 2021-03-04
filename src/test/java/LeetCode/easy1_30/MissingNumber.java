package LeetCode.easy1_30;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingNumber {


    public static int missingNumber(int[] nums) {
     /*  Set<Integer> set = new HashSet<>();

       for(int i: nums){
           set.add(i);
       }

       for(int i=0;i<nums.length;i++){
           if(!set.contains(i)){
               return i;
           }
       }
*/
        int sum=0;
         for(int i: nums){
             sum += i;
         }
         int n= nums.length+1;
         return (n * (n-1) /2) - sum;

     // return -1;
    }

    public static void main(String[]args){

        int[] nums = {3,0,1};

        System.out.println(missingNumber(nums));
    }



}
