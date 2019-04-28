package makeSeleniumEasy;


import java.util.HashMap;

public class Practice {
  /* 7
           7 6
           7 6 5
           7 6 5 4
           7 6 5 4 3
           7 6 5 4 3 2
           7 6 5 4 3 2 1*/

    public static void main(String[] args) {


        int num = 25;

        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            {
                System.out.println(i);
            }
        }



    }
}