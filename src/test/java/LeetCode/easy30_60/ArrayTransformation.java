package LeetCode.easy30_60;

import org.apache.commons.lang.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Input = {1,6,3,4,3,5}   Output = {1,4,4,4,4,5}
 * Input = {6,2,3,4} Output = {6, 3, 3, 4}
 * If an element is smaller than both it's right & left neighbor it will be incremented else If an element is bigger than both it's right & left neighbor it will be decremented,
 * the first and last elements never change
 *
 * After some days the array doesn't change return that array
 * */

public class ArrayTransformation {

    public static List<Integer> transformArray(int[]nums){
      //  List<Integer>list = new ArrayList<>();

        int[]copy;
        int len = nums.length;

        // DO block verifies the condition
      do {
          copy = Arrays.copyOf(nums,len);

          // with first iteration increments or decrements, repeat the same until the condition is satisfied
          for (int i = 1; i <len - 1; i++) {

              if (copy[i] < copy[i - 1] && copy[i] < copy[i + 1]) {
                  nums[i]++;

              } else if (copy[i] > copy[i - 1] && copy[i] > copy[i + 1]) {
                  nums[i]--;
              }

          }
      }while(!Arrays.equals(nums,copy));
        List<Integer>list = Arrays.asList(ArrayUtils.toObject(nums));
        return list;
      //return Arrays.stream(nums).boxed().collect(Collectors.toList());
    }

    public static void main(String[]args){
        int [] nums = {1,6,3,4,3,5};

        System.out.println(transformArray(nums));
    }
}
