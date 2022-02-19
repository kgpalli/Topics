package LeetCode.easy1_30;
/**
 * Example 1:
 *
 * Input: x = 4
 * Output: 2
 * Example 2:
 *
 * Input: x = 8
 * Output: 2
 * Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.
 * */

public class sqrt_69 {

    public static int mySqrt(int x) {
        int low =1;
       int high=x;
       int res=0;

        if(x<2){
            return x;
        }
       while(low<high){
           int mid =  low + (high-low)/2;
           if(mid <= x/mid){
               res=mid;
               low=mid+1;
           }else {
               high=mid;
           }
       }
       return res;

    }


    public static void main (String[]args) {

    int num=3;

    System.out.println(mySqrt(num));
    }
}
