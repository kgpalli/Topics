package LeetCode.easy1_30;

import java.util.Arrays;

public class MoveZeros {

    public static void moveZeroes(int[] nums) {


       int k=0;

       for(int i=0;i<nums.length;i++){
           if(nums[i] != 0){
               nums[k++] = nums[i];

           }
       }

       for(int i=k;i<nums.length;i++){
           nums[i]=0;
       }
       System.out.println(Arrays.toString(nums));


    }

    public static void main (String[]args){

        int[] nums = {0,1,0,3,12};

        moveZeroes(nums);


    }

}
