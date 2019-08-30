package hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionariesMaps {

    /*
    3
sam 99912222
tom 11122222
harry 12299933
sam
edward
harry
  Response : sam=99912222
Not Found


   */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // it's 3 , go till harry
        Map<String,Integer> map = new HashMap<String,Integer>();

        for(int i=0;i<n;i++)
        {
            String name = sc.next();
            int phone = sc.nextInt();
            map.put(name,phone); // saves details till harry

            sc.nextLine();
        }
        System.out.println("111" + map);
        while(sc.hasNext())
        {
            String s = sc.next(); // it starts from sam, & checks if map has any value for sam

            if(map.get(s)==null)
            {
          System.out.println("Not Found");
            }
            else {
                System.out.println(s + "=" + map.get(s));
            }
        }








    }
}
