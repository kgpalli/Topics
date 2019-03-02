package HashMap;

import java.util.HashMap;

public class CopyMapToMap {
    public static void main(String[] args) {

        HashMap<Integer,String> map1 = new HashMap<Integer, String>();
        HashMap<Integer,String> map2 = new HashMap<Integer, String>();

        map1.put(1, "Ajit");
        map1.put(2, "Ajay");
        map1.put(3, "Ajiz");

        /*map2.put(1, "Anil");
        map2.put(2, "Anuh");
        map2.put(3, "Anji");*/
//m if we maintain same sequence map2 value s are replaced by map1 after putaLL

        map2.put(4, "Anil");
        map2.put(5, "Anuh");
        map2.put(6, "Anji");

map2.putAll(map1);

System.out.println(map2);







    }
}
