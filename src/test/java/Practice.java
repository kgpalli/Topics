import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Practice {

    public static boolean isPerfectSquare(int num) {

        if(num<2) return true;
        int start = 2;
        int end = num/2;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid * mid == num){
                return true;
            }else if ( mid * mid > num){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }


        return false;
    }
    public static void main (String[]args) {

     int n=14;

     System.out.println(isPerfectSquare(n));
    }

    }


