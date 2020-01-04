package makeSeleniumEasy;

import java.util.*;

public class CountOfCharsInString_8 {



    public   static void getDuplicateChars(char [] charCountMap)
    {
        Set<Character> list = new HashSet<>();
        char ch = ' ';
        for(int i=0;i<charCountMap.length;i++)
        {
            for(int j=i+1;j<charCountMap.length;j++)
            {
                if(charCountMap[j] == charCountMap[i])
                {
                    list.add(charCountMap[i]);
                }
            }
        }

        System.out.println("Duplicate chars are : " + list);


    }


    public static void main(String args[]) {
        String str = "java program";

        char[] ch = str.toCharArray();

        int count = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for (Character c : ch) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        System.out.println("map value is : " + map);

        getDuplicateChars(ch);

    }
}





