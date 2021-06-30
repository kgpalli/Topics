package LeetCode.easyGT60;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1033. Moving Stones Until Consecutive
 * Example 1:
 *
 * Input: a = 1, b = 2, c = 5
 * Output: [1,2]
 * Explanation: Move the stone from 5 to 3, or move the stone from 5 to 4 to 3.
 * Example 2:
 *
 * Input: a = 4, b = 3, c = 2
 * Output: [0,0]
 * Explanation: We cannot make any moves.
 * Example 3:
 *
 * Input: a = 3, b = 5, c = 1
 * Output: [1,2]
 * Explanation: Move the stone from 1 to 4; or move the stone from 1 to 2 to 4.
 *
 * */

public class NumMovesStones {

    public static int[] numMovesStones(int a, int b, int c) {
        int min_moves=0;

        int[]arr = new int[]{a,b,c};
        Arrays.sort(arr);
        int min = arr[0];
        int mid = arr[1];
        int max = arr[2];
         if(max-min==2){
             min_moves=0;
         }else if(max-mid<=2 || mid-min <=2){
             min_moves=1;
         }else
             min_moves=2;

        int max_moves= max-min-2;


        return new int[]{min_moves,max_moves};
    }


    public static void main(String[]args){
      int a=3;
      int b=5;
      int c=1;


 System.out.println(Arrays.toString(numMovesStones(a,b,c)));
    }
}
