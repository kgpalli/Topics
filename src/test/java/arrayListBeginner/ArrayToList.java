package arrayListBeginner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {

    public static void main(String[] args) {

        String[]array1 = new String[]{"ANDROID","IPHONE","JAVA","SELENIUM"};

        List<String> list = new ArrayList<String>(Arrays.asList(array1));

        System.out.println(list);


//   List to array

        List<String> list1 = new ArrayList<String>();
        list1.add("ANDROID");
        list1.add("IPHONE");
        list1.add("JAVA");
        list1.add("SELENIUM");

        String[]array2 = new String[list1.size()];

        list1.toArray(array2);

        for(String s :array2 )
        {
            System.out.println(s);
        }






    }


}
