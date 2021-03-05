package LeetCode.easy1_30;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

    public static boolean wordPattern(String pattern, String s) {

        String[]str = s.split(" ");

        if(pattern.length() != str.length){
            return false;
        }
        Map<Character,String>map = new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
            if(map.containsKey(ch)){
                if(!map.get(ch).equals(str[i])){
                    return false;
                }
            }else{
               if(map.containsValue(str[i])) {
                   return false;
               }
            }
            map.put(ch, str[i]);
        }
        return true;

    }

    public static void main (String[]args){

        String s = "dog cat cat dog";
        String pattern = "abba";

        System.out.println(wordPattern(pattern,s));

    }

}
