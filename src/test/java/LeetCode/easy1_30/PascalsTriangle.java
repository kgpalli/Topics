package LeetCode.easy1_30;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> traignle = new ArrayList<List<Integer>>();


        // First base case; if user requests zero rows, they get zero rows.
        if(numRows == 0){
            return traignle;
        }

        // Second base case; first row is always [1].

       List<Integer> first_row = new ArrayList<>();
        first_row.add(1);
        traignle.add(first_row);

        for(int i=1;i<numRows;i++){
            List<Integer> row = new ArrayList<>();
            List<Integer> preRow= traignle.get(i-1); // It gives row index values
            row.add(1);
            for(int j=1;j<i;j++){
                row.add(preRow.get(j-1)+preRow.get(j));
            }
            row.add(1);
            traignle.add(row);
        }

      for(int i=0;i<traignle.size();i++){
          System.out.println(traignle.get(i)+ " ");
      }


        return traignle;

    }


    public static void main (String[] args){


    }
}
