package LeetCode.easy1_30;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {


    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Boolean> map2 = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {

            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if (map1.containsKey(ch1)) {
                if (map1.get(ch1) != ch2) {
                    return false;
                }
            } /*else {
                if (map2.containsKey(ch2)) {
                    return false;
                }else{
                    map1.put(ch1, ch2);
                    map2.put(ch2, true);
                }
            }*/

            map1.put(ch1, ch2);


        }

     return true;
    }




    public static void main(String[] args) {

        String s = "paper";
        String t = "title";

        System.out.println(isIsomorphic(s, t));
    }

}
