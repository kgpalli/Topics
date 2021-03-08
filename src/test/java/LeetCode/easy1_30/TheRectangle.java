package LeetCode.easy1_30;

import java.util.Arrays;
/**
 * Input - 122122, Out put = [427, 286]
 * */

public class TheRectangle {

    public static int[] constructRectangle(int area) {

        int width = (int)Math.sqrt(area);
        while (area % width != 0) {
            width--;
        }
        return new int[]{area/width , width};

    }


    public static void main (String[]args){

        System.out.println(Arrays.toString(constructRectangle(122122)));


    }
}
