package LeetCode.easy30_60;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class BuddyStrings {


    public static boolean buddyStrings(String a, String b) {
     if(a.length() != b.length()){
         return false;
     }
     if(a.equals(b)){
         HashSet<Character> uniques_chars = new HashSet<>();
         for(char c: a.toCharArray()){
             uniques_chars.add(c);
         }

         if(uniques_chars.size() <a.length()){
             return  true;
         }else{
             return false; }
     }

        List<Integer>diff = new ArrayList<>();
     for(int i=0;i<a.length();i++) {
         if (a.charAt(i) != b.charAt(i)){
             diff.add(i);
         }
     }
        if (diff.size() == 2 &&
                a.charAt(diff.get(0)) == b.charAt(diff.get(1)) &&
                a.charAt(diff.get(1)) == b.charAt(diff.get(0))) {

            return true;
        }else{
            return false;
        }
    }

    public static void main(String[]args){
        String s1 = "aaaaaaabc";
        String s2 = "aaaaaaacb";


      System.out.println(buddyStrings(s1,s2));
    }
}
