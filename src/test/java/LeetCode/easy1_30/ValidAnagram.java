package LeetCode.easy1_30;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        int[] counts = new int[26];

        for(int i=0;i<s.length();i++){
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }

        for(int i: counts){
            if(i != 0 ){
                return false;
            }
        }
       return true;
    }

    public static void main(String[]args){
        String s1 = "car";
        String s2 = "rat";

        System.out.println(isAnagram(s1,s2));
    }
}
