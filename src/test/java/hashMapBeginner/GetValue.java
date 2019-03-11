package hashMapBeginner;

import java.util.HashMap;
import java.util.Map;

public class GetValue {


    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<Integer,String>();

        map.put(1,"Aruna");
        map.put(2,"Ananya");
        map.put(3,"Abhinav");
        map.put(4,"Anuhya");
        map.put(5,"Ahalya");

        //  count the number of key-value (size) mappings in a map

          System.out.println(map.isEmpty());

        System.out.println(map.size());

        for(Map.Entry s:map.entrySet())
        {
            System.out.println(s.getKey() + " , " + s.getValue());
        }


        map.clear(); // to remove all the values from a map

        System.out.println(" Chek if map isEmpty " + map.isEmpty());

HashMap<Integer,String> map2 = new HashMap<>();

        map2.put(6,"Bhavani");
        map2.putAll(map);


        System.out.println(map2); // it will print only map2 as map 1 is cleared





    }
}
