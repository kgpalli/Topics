package HashMap;



import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ArrayListToMap {

    //  print duplicate keys in hasmap

    @Test
    public void print_duplicate_List() {

        HashMap<String,ArrayList<String>> map = new HashMap<>();

        ArrayList<String> list = new ArrayList<>();
        list.add("mango");
        list.add("mango");
        list.add("banana");
        list.add("mango");
        list.add("apple");

        map.put("one",list);


        for(Map.Entry<String,ArrayList<String>> en :map.entrySet())
        {
            System.out.println(en.getValue());
        }
    }

    @Test
    public void print_map_withduplicate_keys() {

        Multimap<String,String> duplicate_map = ArrayListMultimap.create();

        duplicate_map.put("Fruits","Banana");
        duplicate_map.put("Fruits","Apple");
        duplicate_map.put("Vegetables","Tomato");
        duplicate_map.put("Fruits","Pears");
        duplicate_map.put("Fruits","Mango");

        for(String value:duplicate_map.values())
        {
            System.out.print(value + " , ");
        }
// to print specific key

        Collection<String>fruits = duplicate_map.get("Fruits");
        System.out.println(fruits);

        Collection<String>veggie = duplicate_map.get("Vegetables");
        System.out.println(veggie);




    }
}
