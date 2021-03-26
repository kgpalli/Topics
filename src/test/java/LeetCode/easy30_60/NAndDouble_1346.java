package LeetCode.easy30_60;

import java.util.HashSet;
import java.util.Set;

/**
 *Input: arr = [10,2,5,3]
 * Output: true
 * Explanation: N = 10 is the double of M = 5,that is, 10 = 2 * 5.
 *
 * Input: arr = [3,1,7,11]
 * Output: false
 * Explanation: In this case does not exist N and M, such that N = 2 * M.
 * Input = -2,0,10,-19,4,6,-8 Output = false;
 * */
public class NAndDouble_1346 {
    public static boolean checkIfExist(int[] arr) {

        Set<Integer> set = new HashSet<>();
          for (int i : arr) {
              if (set.contains(i * 2) || ( i % 2 == 0 && set.contains(i/2))) return true;

              set.add(i);
           }

        return false;
    }

    public static void main(String[]args){
        int[]arr = {7,1,14,11};

        System.out.println(checkIfExist(arr));

    }
}
