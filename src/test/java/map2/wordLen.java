package map2;

import java.util.HashMap;
import java.util.Map;

public class wordLen {
    public static void main(String[]args)
    {
        String[] str = {"a", "bb", "a", "bb"};
        Map<String, Integer>map = new HashMap<>();

            for(int i=0;i<str.length;i++)
            {
                String tmp = str[i];// I iteration tmp="a", II iteration tmp= "bb"
                map.put(tmp,tmp.length());

            }
        System.out.println(map);

    }


}
