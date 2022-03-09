package LeetCode.easy30_60;

import java.util.Arrays;

public class CountingBits {

    public static int[] countBits(int n) {
     int [] arr = new int[n+1];
     for(int i=1;i<n;i++){
         System.out.println(arr[i>>1]);
         arr[i] = arr[i>>1]+i%2;
     }


     return arr;
    }

    public static void main (String[]args){
        System.out.println(Arrays.toString(countBits(10)));


    }
}
