package geeksforgeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListInASingleLine {

    public static <T> List<T> createList(T n){

        // Currently only one value is taken

        int size = 1;

        T arr[] = (T[]) new Object[1];
        // Add the specified value in the array
        arr[0] =n;

        // System.out.println(Arrays.toString(arr));
        List<T>list = Arrays.asList(arr);
        return list;

    }


    public static void main(String[] args){

       String str = "Create list in single line";

        int N = 1024;
        System.out.println("List with element "
                + N + ": "
                + createList(N));


        System.out.println("List with element "
                + str + ": "
                + createList(str));


}



}
