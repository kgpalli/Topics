package hackerRank2.execptionHandling;

import java.util.Scanner;

/*
1. input = 3 5 out put = 243   2.input = 2 4, output = 16
3. input = 0 0  output = java.lang.Exception: n and p should not be zero: / by zero  ,   4. input = -1 -2, output = java.lang.Exception: n or p should not be negative.
5. input = -1 3, output = java.lang.Exception: n or p should not be negative.
* */

public class ExceptionPr2 {
    public static final MyCalculator myCalculator = new MyCalculator();
    public static final  Scanner in = new Scanner(System.in);

    public static void main (String[]args){

        while(in.hasNext()) {
            int n = in.nextInt();
            int p = in.nextInt();

            try {
                System.out.println(myCalculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);

            }
        }
    }
}


class MyCalculator {
  long power(int n,int p) throws Exception{
       if(n<0 || p<0)
       {
           throw new Exception("n or p should not be negative");
       }else if(n==0 || p==0 )
       {
           throw new Exception("n and p should not be zero");
       }
       return (long)Math.pow(n,p);
    }

}