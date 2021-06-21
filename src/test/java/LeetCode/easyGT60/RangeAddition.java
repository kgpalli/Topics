package LeetCode.easyGT60;
/**
 * 598. Range Addition II
 * Input: m = 3, n = 3, ops = [[2,2],[3,3]]
 * Output: 4
 * Explanation: The maximum integer in M is 2, and there are four of it in M. So return 4.
 * Example 2:
 *
 * Input: m = 3, n = 3, ops = [[2,2],[3,3],[3,3],[3,3],[2,2],[3,3],[3,3],[3,3],[2,2],[3,3],[3,3],[3,3]]
 * Output: 4
 * Example 3:
 *
 * Input: m = 3, n = 3, ops = []
 * Output: 9
 *
 *
 * */

public class RangeAddition {

    public static int maxCount(int m, int n, int[][] ops) {
     int count=0;
     int[][]arr = new int[m][n];

     for(int[]op:ops ) {
         for (int i = 0; i < op[0]; i++) {
             for (int j = 0; j < op[1]; j++) {
            arr[i][j] +=1;
             }
         }
     }

     for(int i=0;i<m;i++){
         for(int j=0;j<n;j++){
             if(arr[i][j]==arr[0][0]){
                 count++;
             }
         }
     }

     return count;
    }


    public static void main(String[]args){
        int m = 3;
        int n = 3;
        int[][]ops = {{2,2},{3,3}};

        System.out.println(maxCount(m,n,ops));


    }
}
