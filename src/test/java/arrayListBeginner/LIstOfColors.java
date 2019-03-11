package arrayListBeginner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LIstOfColors {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");
        System.out.println(list + "  ");

// To iterate through all elements

        for (String ele : list) {
            System.out.println(ele + "  ");
        }

// Insert the element at index 0

        list.add(0, "Brown");
        list.add(3, "Pink");


        System.out.println(list + "  " + "After inserting the elements ");

        // To update the list

        list.set(0, "Violet");

        System.out.println(list + "  " + "After updating the elements ");

        // Sort the elements

        System.out.println(list + "  " + "Before sorting the elements ");

        Collections.sort(list);

        System.out.println(list + "  " + "After sorting the elements ");

        // To reverse the elements

        Collections.reverse(list);

        System.out.println("After reversing the list " + list);

        // to remove with index

        list.remove(2);

        System.out.println(list + "  " + "After removing the elements with index");

        // to remove with object

        list.remove("Yellow");

        System.out.println(list + "  " + "After removing the elements with Object");

        // to search for an element

        if (list.contains("Green")) {
            System.out.println("Found the element");
        } else {
            System.out.println("Not Found the element");
            }

            // To copy one list into another

        List<String>list2 = new ArrayList<>();
        list2.add("Square");
        list2.add("Circle");

       Collections.copy(list,list2);
        System.out.println("After copy");
       System.out.println(list);// it will replace the elements in specific index
        System.out.println(list2);


        // Shuffle the elements

        Collections.shuffle(list);

        System.out.println("After shuffling the list " + list);


    }
}
