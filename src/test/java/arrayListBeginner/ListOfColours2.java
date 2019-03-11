package arrayListBeginner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListOfColours2 {

    public static void main(String[] args) {


        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        System.out.println("Original list: " + list_Strings);

        // to print the portion of list

        List<String> subList = list_Strings.subList(0,3);

        System.out.println("Sub list is : " + subList);

        //  swap elements

        for(String s:list_Strings) {
            Collections.swap(list_Strings, 1, 3);
        }
        System.out.println("List After swap : " );
            for(String s1 : list_Strings)
            {
                System.out.println( s1);
            }



// to compare the list and  print Yes or No

        List<String> list_Strings2 = new ArrayList<String>();

        list_Strings2.add("Red");
        list_Strings2.add("Green");
        list_Strings2.add("Pink");

        List<String> list_Strings3 = new ArrayList<String>();

        for(String str : list_Strings)
            list_Strings3.add(list_Strings2.contains(str)? "Yes":"No");
        {
            System.out.println(list_Strings3);
        }

    }

}
