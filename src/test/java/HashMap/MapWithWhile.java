package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapWithWhile {

    public static void main(String[] args) {

        HashMap<Integer , String> map = new HashMap<Integer,String>();
        map.put(1,"Gaurav");
        map.put(2,"Ganesh");
        map.put(3,"Gangooly");
        map.put(4,"Gyan");
        map.put(5,"Ganapathi");

        Iterator itr = map.entrySet().iterator();
        while(itr.hasNext())
        {
            Map.Entry map1 = (Map.Entry)itr.next();
            System.out.println("Key is " + map1.getKey() + " Value is " + map1.getValue());

        }

    }

    }

