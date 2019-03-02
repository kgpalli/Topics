package HashMap;

import java.util.HashMap;

public class Anagrams {
    public static void main(String[] args) {

String str1 = "listen";
String str2 = "silent";

str2 = str2.toUpperCase();
str1 = str1.toUpperCase();

        HashMap<Character,Integer> map1 =  new HashMap<Character,Integer>();

        HashMap<Character,Integer> map2 =  new HashMap<Character,Integer>();

        char[]c1 = str1.toCharArray();
        char[]c2 = str2.toCharArray();

        for(int i=0;i<c1.length;i++)
        {
            if(map1.get(c1[i]) == null)
            {
                map1.put(c1[i],1);
                System.out.println("jkshkl = " +c1[i]);
            }else
            {
                Integer j = (int)map1.get(c1[i]);
                map1.put(c1[i],++j);

                System.out.println("second = " +map1);
            }
        }

        for(int i=0;i<c2.length;i++)
        {
            if(map2.get(c2[i]) == null)
            {
                map2.put(c2[i],1);
            }else
            {
                Integer j1 = (int)map2.get(c2[i]);
                map1.put(c2[i],++j1);
            }
        }


        if(map1.equals(map2))
        {
            System.out.println("Strings are anagrams");
        }else
        {
            System.out.println("Strings are not anagrams");
        }
    }
    }
