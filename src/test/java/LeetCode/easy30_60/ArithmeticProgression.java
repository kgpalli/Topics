package LeetCode.easy30_60;

import java.util.Arrays;

/**
 * Input: arr = [3,5,1]   Output: true
 * Explanation: We can reorder the elements as [1,3,5] or [5,3,1] with differences 2 and -2 respectively,
 * between each consecutive elements.
 * Input: arr = [1,2,4]   Output: false
 * */

public class ArithmeticProgression {

    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int difference = Math.abs(arr[1] - arr[0]);
        for(int i=1;i<arr.length-1;i++){
            if(difference != Math.abs(arr[i+1]-arr[i])){
                return false;
            }
        }
    return true;
    }


    public static void main(String[]args){
        int[]arr = {3,5,1};

        System.out.println(canMakeArithmeticProgression(arr));

    }
}
