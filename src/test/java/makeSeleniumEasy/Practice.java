package makeSeleniumEasy;


import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice {

    public static void main(String[] args) {

        String str = "racecar";
        char[] ch = str.toCharArray();

StringBuilder sb = new StringBuilder();

        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                   if(str.charAt(i)==str.charAt(j))
                   {
                       System.out.println(str.charAt(j));
                   }
                }
            }
        }

        Set<Character> charset = new HashSet<>();

        for(Character c : ch)
        {
            charset.add(c);
        }

        for(Character cc: charset)
        {
           sb.append(Character.toString(cc));

        }

System.out.println("After modifying string " + sb);

        }



}

    // Java
// Java . a

// J == 1 = No ==> 0
// ava , a
// a==a , 1
// va , a
