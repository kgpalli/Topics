package hashMapBeginner;

import java.util.HashMap;
import java.util.Map;

public class getShallowCopy {

    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<Integer,String>();

        map.put(1,"Aruna");
        map.put(2,"Ananya");
        map.put(3,"Abhinav");
        map.put(4,"Anuhya");
        map.put(5,"Ahalya");

        for(Map.Entry s: map.entrySet())
        {
            System.out.println(s.getKey() + " , " + s.getValue());
        }


        HashMap<Integer,String> newMap = new HashMap<Integer,String>();


        newMap = (HashMap)map.clone();


    }


}
