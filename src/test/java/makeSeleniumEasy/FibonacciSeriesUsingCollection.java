package makeSeleniumEasy;

import java.util.ArrayList;

public class FibonacciSeriesUsingCollection {

    public static void main(String[] args) {


        int length = 10;
        ArrayList<Integer>fibonacciSeries = new ArrayList<>();

        // Since first two numbers are 0 and 1 in fibonacci series.


        fibonacciSeries.add(0);
        fibonacciSeries.add(1);

        // Handling negative length

        if(length<=0)
        {
            System.out.println("length cannot be negative");
        }else if(length==1)
        {
            System.out.println(fibonacciSeries.get(0));
        }else if(length==2)
        {
            System.out.println(fibonacciSeries);
        }else
        {
            // Counter starts from 3 as first two numbers in series are 0 and 1.

            for(int i=3;i<=length;i++)
            {
                // Since index starts from 0

                fibonacciSeries.add((fibonacciSeries.get(i-2))+(fibonacciSeries.get(i-3)));

            }

            System.out.println("Fibonacci serires of length " + length + " is below:");
            System.out.println(fibonacciSeries);
        }







    }
}
