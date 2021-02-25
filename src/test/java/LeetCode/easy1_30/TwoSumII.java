package LeetCode.easy1_30;

import java.util.*;

public class TwoSumII {

    public static int[] twoSum(int[] numbers, int target) {
      int a_pointer=0;
      int b_pointer=numbers.length-1;

      while(a_pointer<=b_pointer){

          int sum = numbers[a_pointer] + numbers[b_pointer];

          System.out.println("Iteration >>>>");

          if(sum>target){
              b_pointer -= 1;
              System.out.println("B pointer is : " + b_pointer);
          }else if (sum<target)
          {
              a_pointer += 1;
              System.out.println("a pointer is : " + a_pointer);
          }else{
              return new int[]{a_pointer+1,b_pointer+1};
          }
      }
      return new int[]{a_pointer+1,b_pointer+1};
    }



    public static void main(String[]args){
        int[]numbers={2,5,4,1,3};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(numbers,target)));




    }
}
