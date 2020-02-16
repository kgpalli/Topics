package map2;

import java.util.HashMap;

public class Pairs {
    public static void main(String[]args)
    {
        String [] strings = {"Orange", "Mango", "Banana","Orange"};

        HashMap<String, String>map = new HashMap<>();
        for(int i=0;i<strings.length;i++)
        {
            String tmp = strings[i];
            String first = String.valueOf(tmp.charAt(0));// convert string valur to char
            String last = String.valueOf(tmp.charAt(tmp.length()-1));
            map.put(first,last);
        }
        System.out.println(map);

    }

}
