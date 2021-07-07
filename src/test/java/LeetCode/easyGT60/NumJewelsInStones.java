package LeetCode.easyGT60;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class NumJewelsInStones {
    public static int numJewelsInStones(String jewels, String stones) {
        HashSet<Character>set = new HashSet<>();
        for(char c : jewels.toCharArray()){
            set.add(c);
        }
        int numJewels=0;
        for(char ch : stones.toCharArray()){
            if(set.contains(ch)){
                numJewels++;
            }
        }
        return numJewels;
    }


    public static void main(String[]args){
        String  jewels = "aA";
        String stones = "aAAbbbb";


        System.out.println(numJewelsInStones(jewels,stones));


    }
}
