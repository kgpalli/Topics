package arrayListBeginner;

import java.util.ArrayList;
import java.util.Collections;

public class ListOfColors3 {




    public static void main(String[] args) {

        ArrayList<String> c1= new ArrayList<String>(3);
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        // Increase capacity
        c1.ensureCapacity(5);
        c1.add("White");
        c1.add("Pink");
        c1.add("Brown");
        System.out.println("List of first array: " + c1);
        ArrayList<String> c2= new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");
        System.out.println("List of second array: " + c2);

        ArrayList<String> a = new ArrayList<String>();

        a.addAll(c1);
        a.addAll(c2);
        System.out.println("New array: " + a);





// to clone

       /* ArrayList<String> clonedList = (ArrayList<String>)c1.clone();

        System.out.println("Cloned list is " + clonedList);

        // to empty the list

        clonedList.removeAll(clonedList);

        System.out.println("Cloned list is emptied " + clonedList);

        System.out.println("Cloned list is emptied or not = " + clonedList.isEmpty());*/



       // To replace the element

        ArrayList<String> c3= new ArrayList<String>();
        c3.add("Rain");
        c3.add("Sunny");
        c3.add("Windy");
        c3.add("Cloudy");

       c3.set(1,"cold");

       int num = c3.size();

       for(int i=0;i<num;i++)
       {
           System.out.println(c3.get(i));
       }

//    Print using index of an element

        for(int index=0;index<num ; index++)
        {
            System.out.println(index + " = " + c3.get(index));
        }

    }
}
