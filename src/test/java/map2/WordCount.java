package map2;

import java.util.HashMap;

public class WordCount {
    public static void main(String[]args)
    {
        int count =0;
        String [] strings = {"c", "c", "c", "c"};
        HashMap<String,Integer>map = new HashMap<>();
        for(int i=0;i<strings.length;i++)
        {
            String tmp = strings[i];
           if(map.containsKey(tmp))
           {
                count=map.get(tmp);
               map.put(tmp,count+1);
           }else
           {
               map.put(tmp,1);
           }


        }
        System.out.println(map);

    }
}
