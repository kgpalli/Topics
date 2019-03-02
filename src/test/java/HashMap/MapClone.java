package HashMap;

import java.util.HashMap;
import java.util.Map;

public class MapClone {
    public static void main(String[] args) {



        /*1. Create an object for the class map.
        2. Put the elements into the map using the put() method.
        3. Again create another object for the class map.
        4. Now finally iterate the map and call put method to clone the initial map.
*/
        HashMap<Integer,String> map1 = new HashMap<>();
        map1.put(1,"Java");
        map1.put(2,"for");
        map1.put(3,"beginners");

        HashMap<Integer,String>map2= new HashMap<Integer,String>();

        for(Map.Entry<Integer,String> entry:map1.entrySet())
        {
            map2.put(entry.getKey(),entry.getValue());
        }


System.out.println("map2 values are" +map2);

// By copy constructor


        HashMap<Integer,String> map3 = new HashMap<>();
        map1.put(4,"Java");
        map1.put(5,"for");
        map1.put(6,"experts");

        HashMap<Integer,String>map4= new HashMap<>();
        map4= new HashMap<>(map3);

        System.out.println("map4 values are " +map4);


    }
}
