package LeetCode.easy30_60;

public class PowerOfFour {
    public static boolean isPowerOfFour(int n) {

        int check = 1;

        while(check<=n){
            if(check==n){
                return true;
            }
            check *= 4;
        }
        return false;

    }

    public static void main (String[]args){

        System.out.println(isPowerOfFour(16));


    }
}
