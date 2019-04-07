package strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateCharacters {
    public static void main(String[] args) {

        String str = "sjfnksfnblds";
        int count = 0;
        String s = str.trim();
        char[]c = s.toCharArray();
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
               if(c[i]==c[j])
               {
                   System.out.println(c[j] + " ");
                   count++;
               }
            }
        }

        // using linked hashset

        Set<Character>charset = new LinkedHashSet<>();

        for(char ch : c)
        {
            charset.add(ch);
        }

       StringBuilder sb = new StringBuilder();
        for(Character character : charset)
        {
            sb.append(character);
            }
        System.out.println(sb.toString());


    }
}
