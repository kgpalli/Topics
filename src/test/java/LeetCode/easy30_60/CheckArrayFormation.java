package LeetCode.easy30_60;

import java.util.HashMap;
import java.util.Map;

public class CheckArrayFormation {

    public static boolean canFormArray(int[] arr, int[][] pieces) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<arr.length;i++){
            map.put(arr[i],i);
        }

        for(int[] piece : pieces){
            if(!map.containsKey(piece[0])){
                return false;
            }
           
            int index = map.get(piece[0]);
            for(int i=1;i<piece.length;i++){
                if(!map.containsKey(piece[i]) || map.get(piece[i]) != ++index){
                    return false;
                }
            }
        }

        return true;
    }


    public static void main(String[]args){

        int[] array = {91,4,64,78};
        int[][]pieces = {{78},{4,64},{91}};

        System.out.println(canFormArray(array,pieces));
    }

}
