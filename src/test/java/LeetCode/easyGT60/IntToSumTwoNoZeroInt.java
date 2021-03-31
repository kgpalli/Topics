package LeetCode.easyGT60;

import java.util.Arrays;

/**
 * Given an integer n. No-Zero integer is a positive integer which doesn't
 * contain any 0 in its decimal representation.
 * Input: n = 10000   Output: [1,9999]
 * Input: n = 1010   Output: [11,999]
 * Input: n = 11   Output: [2,9]
 * */

public class IntToSumTwoNoZeroInt {

    public static int[] getNoZeroIntegers(int n) {
        for (int i = 1; i < n; ++ i) {
            int a = i;
            int b = n - a;
            if (nozeros(a) && nozeros(b)) {
                return new int[]{a, b};
            }
        }
        return null;
    }

    private static boolean nozeros(int x) {
        System.out.println(x);
        while (x > 0) {
            if (x % 10 == 0) return false;
            x /= 10;
        }
        return true;
    }

    public static void main(String[]args){
        int n= 4102;
        System.out.println(Arrays.toString(getNoZeroIntegers(n)));

    }
}
