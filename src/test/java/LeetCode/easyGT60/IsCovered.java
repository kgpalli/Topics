package LeetCode.easyGT60;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 1893. Check if All the Integers in a Range Are Covered
 * Example 1:
 *
 * Input: ranges = [[1,2],[3,4],[5,6]], left = 2, right = 5
 * Output: true
 * Explanation: Every integer between 2 and 5 is covered:
 * - 2 is covered by the first range.
 * - 3 and 4 are covered by the second range.
 * - 5 is covered by the third range.
 * Example 2:
 *
 * Input: ranges = [[1,10],[10,20]], left = 21, right = 21
 * Output: false
 * Explanation: 21 is not covered by any range.
 *
 * Note : it adds all the numbers between 0th index to 1 index in each array
 * */

public class IsCovered {

    public static boolean isCovered(int[][] ranges, int left, int right) {

        Set<Integer>set = new HashSet<>();
        for(int[] interval : ranges){
            for(int i=interval[0];i<=interval[1];i++){
              set.add(i)  ;
            }
        }

        for(int i=left;i<=right;i++){
          if(!set.contains(i)){
              return false;
          }

        }

        return true;
    }


    public static void main(String[]args){
        int[][]ranges = {{1,2},{3,4},{5,6}};

        int left = 1;
        int right = 50;

        System.out.println(isCovered(ranges,left,right));



    }


}
