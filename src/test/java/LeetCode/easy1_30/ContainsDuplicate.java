package LeetCode.easy1_30;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicate {


    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int i : nums){
            if(set.contains(i)){
                return true;
            }
            set.add(i);

        }

        return false;

    }
    public static void main(String[]args){

    int [] nums = {1,2,3,1};

    System.out.println(containsDuplicate(nums));




    }
}
