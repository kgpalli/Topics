package LeetCode.easyGT60;

/**
 * Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise,
 * return the number of negative numbers in grid.
 *
 * Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
 * Output: 8
 * Explanation: There are 8 negatives number in the matrix.
 *
 * Input: grid = [[3,2],[1,0]]
 * Output: 0
 *
 * Input: grid = [[-1]]
 * Output: 1
 *
 * */

public class CountNegative {

    public static int countNegatives(int[][] grid) {
     int count = 0;

     for(int[]i: grid){
         for(int j: i){
             if(j<0)
                 count++;
         }
     }

     return count;
    }

    public static void main (String[]args){
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};

        System.out.println(countNegatives(grid));

    }
}
