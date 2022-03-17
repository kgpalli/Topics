package LeetCode.easy30_60;

import java.util.HashMap;
import java.util.Map;

public class RansomeNote {

    public static boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length()) return false;
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
       for(int i=0;i<ransomNote.length();i++) {
           char ch = ransomNote.charAt(i);
           map1.put(ch,map1.getOrDefault(ch,0)+1);
       }
        for(int i=0;i<magazine.length();i++) {
            char ch = magazine.charAt(i);
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
        for(char ch : map1.keySet()){
            if(!map2.containsKey(ch)) {
                return false;
            }else if(map2.containsKey(ch) && map2.get(ch)<map1.get(ch))return false;
        }
        return true;
    }

    public static void main(String[]args){
        String ransomNote = "a";
        String magazine = "b";

        System.out.println(canConstruct(ransomNote,magazine));


    }

}
