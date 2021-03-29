package LeetCode.easy30_60;

/**
 * 	62. Armstrong Number :  if we add qube of any number and if it's equal to the number itself that is Armstrong number
 * Ex : 153   => 1*1*1 = 1 + 5*5*5 = 125 + 3*3*3 = 27  => 153 -> true
 *   input = 25 , qube of 2, 5 = 133 -> false
 * */

public class ArmstrongNumber {

    public static boolean isArmstrongNumber(int num){

        int sum=0, temp=num;

        while(num>0){
            int r= num%10;
            num /= 10;
            sum += r*r*r;
        }

        return temp == sum;
    }


    public static void main(String[]args){

       System.out.println(isArmstrongNumber(25));

    }
}
