package LeetCode.easy1_30;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int reverse(int x) {

        int reverse=0;
        while(x>0){
            int rem = x%10;
            reverse = reverse*10+rem;
            x = x/10;
        }

        return reverse;

    }


    public static void main(String[] args){

        int nums = 123;


       System.out.println(reverse(nums));



    }

}
