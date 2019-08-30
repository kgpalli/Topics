package miscillaneous;

import java.util.Arrays;
import java.util.HashSet;

public class UniqueElementsInArray {
    public static void main(String[] args) {
       /*int arr[] = {23,23,45,10,10,36};
       int end = arr.length;
       String str = "PrintUniqueElements";
       str = str.toLowerCase();
       String[]words = str.split("");

        HashSet<String>set = new HashSet<>();
        HashSet<Integer>set1 = new HashSet<Integer>(end);
        for(String s:words)
        {
            set.add(s);
        }
       for(int i=0;i<end;i++)
       {
           set1.add(arr[i]);
       }
       System.out.println("set values are = " + set.toString() + "set1 values are " + set1);*/
// 2 Method

        int arr1[] = {1,4,6,1,2,6};
        Arrays.stream(arr1).distinct().toArray();
        System.out.println(arr1);



       }
}
