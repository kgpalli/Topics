package LeetCode.easy1_30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PascalTriangle_2 {

    public static List<Integer> getRow(int rowIndex) {



        List<List<Integer>> triagnle = new ArrayList<List<Integer>>();


        // First base case; if user requests zero rows, they get zero rows.
        if(rowIndex < 0){
          return new ArrayList<>();
        }

        // Second base case; first row is always [1].

        List<Integer> first_row = new ArrayList<>();
        first_row.add(1);
        triagnle.add(first_row);

        for(int i=1;i<=rowIndex;i++){
            List<Integer> row = new ArrayList<>();
            List<Integer> preRow= triagnle.get(i-1); // It gives row index values
            row.add(1);
            for(int j=1;j<i;j++){
                row.add(preRow.get(j-1)+preRow.get(j));

            }
            row.add(1);
            triagnle.add(row);
        }
        return triagnle.get(triagnle.size()-1);

    }


    public static void main(String[]args){

        System.out.println(getRow(6));

    }
}
