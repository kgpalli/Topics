package LeetCode.easy30_60;

/**
 * Given an array of integers arr, return true if and only if it is a valid mountain array.
 * Input = 3,5,5, output = false
 * Input = 0,3,2,1 output = true
 * */

public class ValidMountainArray {

    public static boolean validMountainArray(int[] arr) {
      int i=0;

      while(i<arr.length && i+1 <arr.length && arr[i]<arr[i+1]){
          i++;
      }

      if(i==0 || i+1 >= arr.length){
          return false;
      }

      while(i<arr.length && i+1 <arr.length){
          if(arr[i]<=arr[i++ +1]){
              return false;
          }
      }


        return true;
    }

    public static void main(String[]args){
       int [] arr = {0,3,2,1};
       System.out.println(validMountainArray(arr));


    }
}
