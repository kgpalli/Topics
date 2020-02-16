package array1;

import java.lang.reflect.Array;
import java.util.Arrays;
// convert an Array to String
public class ArrayToString {

    // Function to add x in arr
    public static int[] addX(int n, int arr[], int x)
    {
        int newArr[] = new int[n+1];
        for(int i=0;i<n;i++){

            newArr[i] = arr[i];
            newArr[n] = arr[x];

        }
        return newArr;

    }
    public static void main(String[] args) {

        String[]arr =new String[] {"one","two","three"};
        System.out.println(Arrays.toString(arr));

        // Java Program to add an element in an Array
        int n= 10;
        int i;
        int arr2[] = {1,2,3,4,5,6,7,8,9,10};

        // print the original array
        for( i=0;i<arr2.length;i++){
            System.out.print( Arrays.toString(arr2));
        }

        // element to be added
        int x = 50;

        // call the method to add x in arr
        arr2 = addX(n, arr2, x);

        System.out.println(Arrays.asList(arr2));







    }

}
