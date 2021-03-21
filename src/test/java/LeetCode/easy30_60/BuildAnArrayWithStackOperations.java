package LeetCode.easy30_60;

import java.util.ArrayList;
import java.util.List;
/**
 * Input: target = [1,3], n = 3
 * Output: ["Push","Push","Pop","Push"]
 *
 * */

public class BuildAnArrayWithStackOperations {

    public static List<String> buildArray(int[] target, int n) {

        int numOfOperations = target.length;
        numOfOperations += ((target[target.length - 1] - target.length) * 2);

        List<String> list = new ArrayList<>(numOfOperations);

        int input = 1;
        for (int i : target) {
        while (input<i) {
            list.add("Push");
            list.add("Pop");
            input++;
        }
            list.add("Push");
            input++;
        }
        return list;

        }

        public static void main(String[]args){
        int[]target = {2,3,4};
        int n= 4;

        System.out.println(buildArray(target,3));

    }
}
