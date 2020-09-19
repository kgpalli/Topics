package hackerRank2;

import java.io.Serializable;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.*;
/*
*
*
*
* */

public class Practice {


    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
     String word1 = sc.next();
     String word2 = sc.next();
     char[]ch1 = word1.toCharArray();
        char[]ch2 = word2.toCharArray();


     HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(char c : ch1)
        {
            if(map1.containsKey(c))
            {
                map1.put(c,map1.get(c)+1);
            }else{
                map1.put(c,1);
            }
        }
        for(char c : ch2)
        {
            if(map2.containsKey(c))
            {
                map2.put(c,map2.get(c)+1);
            }else{
                map2.put(c,1);
            }
        }


if(map1.equals(map2)){
    System.out.println("Anagrams");
}else{
    System.out.println("Not Anagrams");
}






}





}



























