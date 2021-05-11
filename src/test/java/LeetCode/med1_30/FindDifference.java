package LeetCode.med1_30;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FindDifference {


    public  static char findTheDifference(String s, String t) {

        HashMap<Character,Integer>map = new HashMap<>();
        for(char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(char c: t.toCharArray()){
            if(!map.containsKey(c) || map.get(c) == 0){
                return c;
            }else{
                map.put(c,map.get(c)-1);
            }
        }
       return '!';
    }




    public static void main(String[]args){
     String s = "abcd";
     String t = "abcde";

        System.out.println(findTheDifference(s,t));

    }
}
