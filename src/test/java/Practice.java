import javax.swing.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Practice {

    public static int singleNumber(int[] nums) {


      if(nums.length ==1){
          return nums[0];
      }
        int i=0;
        int j=i+1;

        while(i<nums.length){

            int single_digit = 0;
            while(j<nums.length-1){
                if(nums[i]==nums[j])
                {single_digit++;
                break;}
                j++;
            }

            if(single_digit==0)
            {
                return nums[i];
            }
            i++;

        }

       return 0;
    }



    public static void main(String[]args){
  String s = "abc";


    }

}
