package LeetCode.easy1_30;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {

    public static int singleNumber(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for(int i: nums){
            if(set.contains(i)){
                set.remove(i);
            }else{
                set.add(i);
            }
        }

        for(int i: set){
            return i;
        }



        return -1;
    }


    public static void main(String[]args){

        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));


    }
}
