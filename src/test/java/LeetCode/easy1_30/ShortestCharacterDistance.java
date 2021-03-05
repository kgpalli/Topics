package LeetCode.easy1_30;

import java.util.Arrays;
/**
 *  Input - "loveleetcode". , C = 'e'
 * Output - [3,2,1,0,1,0,0,1,2,2,1,0]
 * */

public class ShortestCharacterDistance {

    public static int[]shortestToChar(String s, char C){
        int n= s.length();
        int[] output_arr = new int[n];
        int c_position = -n;

        for(int i=0;i<n;i++){
            if(s.charAt(i) == C){
                c_position = i;
            }
            output_arr[i] = i-c_position;
        }
     //loveleetcode, 12,13,14,0,1, 0,0,1,2,3,4,0 => after 1st for loop
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i) == C){
                c_position = i;
            }
            output_arr[i] = Math.min(output_arr[i],Math.abs(i-c_position));
        }
        //loveleetcode, 3,2,1,0,1,0,0,1,2,2,1,0 => after 2nd for loop
        return output_arr;
    }




    public static void main(String[]args){
System.out.println(Arrays.toString(shortestToChar("loveleetcode",'e')));
    }
}
