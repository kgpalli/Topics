package miscillaneous;

import java.util.ArrayList;
import java.util.Iterator;

public class ThreeLoops {
    public static void main(String[] args) {


        ArrayList<Integer>list = new ArrayList<>();
        list.add(30);
        list.add(40);
        list.add(50);
        Iterator itr = list.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

        ArrayList<String>list2 = new ArrayList<>();

        list2.add("Bhavani");
        list2.add("Bhavana");
        list2.add("Bhauvaneshwari");
        list2.add("Bhavya");

        for(int i=0;i<list2.size();i++)
        {
            System.out.println(list2.get(i));
        }
        ArrayList<Integer>list3 = new ArrayList<>();

        list3.add(21);
        list3.add(31);
        list3.add(41);
        list3.add(22);
        for(Integer i : list3)
        {
            System.out.println(i);
        }



    }
}
