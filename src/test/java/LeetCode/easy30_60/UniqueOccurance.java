package LeetCode.easy30_60;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
// Output = True

public class UniqueOccurance {


    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer>int_occurence = new HashMap<>();

        for(int i: arr){
            int_occurence.put(i,int_occurence.getOrDefault(i,0)+1);
        }
        Set<Integer> set = new HashSet<>(int_occurence.values());
        return set.size()==int_occurence.size();

    }



    public static void main(String[]args){

        int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};

        System.out.println(uniqueOccurrences(arr));

    }
}
