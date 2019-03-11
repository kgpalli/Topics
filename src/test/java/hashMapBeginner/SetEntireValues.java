package hashMapBeginner;

import java.util.HashMap;
import java.util.Set;

public class SetEntireValues {

    public static void main(String[] args) {


        HashMap< Integer, String > hash_map = new HashMap < Integer, String > ();
        hash_map.put(1, "Red");
        hash_map.put(2, "Green");
        hash_map.put(3, "Black");
        hash_map.put(4, "White");
        hash_map.put(5, "Blue");
        hash_map.put(6,"Blue");
Set set = hash_map.entrySet(); // supposed to give unique values
System.out.println("set values " + set);

// to get specified value

        String val = (String)hash_map.get(3);// string is redundunt

        System.out.println(val);

// To get all the keys


        Set keyset = hash_map.keySet(); // supposed to give unique values
        System.out.println("keyset values " + keyset);



        // To get collection of values

        System.out.println("hashmap values " + hash_map.values());



    }



}
