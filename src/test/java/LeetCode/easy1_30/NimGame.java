package LeetCode.easy1_30;

public class NimGame {

    public static boolean canWinNim(int n) {
         return n%4 != 0;
    }


    public static void main(String[]args){

        System.out.println(canWinNim(10));

    }



}
