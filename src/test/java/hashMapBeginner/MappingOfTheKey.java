package hashMapBeginner;

import java.util.HashMap;

public class MappingOfTheKey {


    public static void main(String[] args) {

        HashMap<String,Integer> map = new HashMap<String,Integer>();


        map.put("Aruna",1);
        map.put("Ananya",2);
        map.put("Abhinav",3);
        map.put("Anuhya",4);
        map.put("Ahalya",5);

        System.out.println("Is Value Ahalya exists ? ");
        if(map.containsKey("Ahalya"))
        {

            System.out.println( " Yes " + map.get("Ahalya"));

        }else
        {
            System.out.println( " No ");
        }

        System.out.println("Is value Anu exists ? ");
        if(map.containsKey("Anu"))
        {
            System.out.println( " Yes " + map.get("Anu"));
        }else
        {
            System.out.println( " No ");
        }

//   To verify value


        HashMap<Integer,String> map1 = new HashMap<Integer,String>();
        map1.put(1,"Aruna");
        map1.put(2,"Ananya");
        map1.put(3,"Abhinav");
        map1.put(4,"Anuhya");
        map1.put(5,"Ahalya");

        System.out.println("Is Value Ahalya exists ? ");
        if(map1.containsValue("Ahalya"))
        {

            System.out.println( " Yes " );

        }else
        {
            System.out.println( " No ");
        }

        System.out.println("Is Value Anu exists ? ");
        if(map1.containsValue("Anu"))
        {
            System.out.println( " Yes " );
        }else
        {
            System.out.println( " No ");
        }

    }



}
