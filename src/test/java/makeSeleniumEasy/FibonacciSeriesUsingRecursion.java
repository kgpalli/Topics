package makeSeleniumEasy;

import java.util.ArrayList;

public class FibonacciSeriesUsingRecursion {

    /*To write recursive method we need to decide two things:
            1. Logic to find fibonacci number . (Every number after the first two is the sum of the two preceding ones)
            2. Exit point/s where recursive method will be stopped recursion. ( When number position is 1st and 2nd as we know first fibonacci number is 1 and 2nd fibonacci number is 1. )
   */
    public static int fibonacciAtPosition(int n)
    // Exit condition as explained above
    {
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }

     return fibonacciAtPosition(n-1)+fibonacciAtPosition(n-2);
    }


    public static void main(String[] args) {


        int length = 10;


        // Handling negative length

        if(length<=0)
        {
            System.out.println("length cannot be negative");
        }else
        {
            // Counter starts from 3 as first two numbers in series are 0 and 1.

            for(int i=1;i<=length;i++)
            {
                // Since index starts from 0

                System.out.print(fibonacciAtPosition(i-1) + " , ");

            }


        }







    }
}
