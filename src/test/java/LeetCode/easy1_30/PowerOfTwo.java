package LeetCode.easy1_30;

public class PowerOfTwo {


    public static boolean isPowerOfTwo(int n) {

        long i = 1;

        while(i<n){
            i *= 2;
        }

        return i == n;

    }



    public static void main(String[]args){

        System.out.println(isPowerOfTwo(35));


    }
}
