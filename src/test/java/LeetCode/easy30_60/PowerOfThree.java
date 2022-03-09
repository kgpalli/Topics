package LeetCode.easy30_60;

public class PowerOfThree {

    public static boolean isPowerOfThree(int n) {

        int sum=1;
        while(sum<n){
            sum *= 3;
            if(sum==n){
                return true;

            }
        }

        return false;
    }

    public static void main (String[]args) {

        int n=0;

        System.out.println(isPowerOfThree(n));
    }

}
