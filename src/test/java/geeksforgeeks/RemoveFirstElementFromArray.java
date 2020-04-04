package geeksforgeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveFirstElementFromArray {

    public static void main(String[] args) {

        int array []= {10,22,30,44,50,66,70};

      List<Integer> list = new ArrayList<Integer>();

       for(int i:array){
           list.add(i);
       }
        // 1st way - to remove at index
           list.remove( 0);
       System.out.println("1st list " + list + "  ");


       // 2nd way - to remove specific value

        list.remove(new Integer(22));

        System.out.println("2nd list " + list + " ");


  // 3rd way - to remove based on value

        Iterator itr = list.iterator();

        while(itr.hasNext()){
            int x = (Integer)itr.next();
            if(x==66)
                list.remove(x);
        }
        System.out.println("3rd list " + list + " ");


        // Remove last element
        list.remove(list.size()-1);

        System.out.println("list " +list);
    }
}
