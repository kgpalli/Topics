package hackerRank2.execptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
1. input = 10, 3 out put = 3   2.input = 10, Hello, output = java.util.InputMismatchException
3. input = 10,0  output = java.lang.ArithmeticException: / by zero  ,   4. input = 23.323, 0 , output = java.util.InputMismatchException
* */

public class ExceptionPr1 {

    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);

        try {
            int n = sc.nextInt();
            int m = sc.nextInt();
           int result = n / m;
            System.out.println(result);
        }catch(InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
            // this class handles Arithmetic & InputMismatch Exception
            // OR System.out.println(e.getClass().getName());
        }
        catch(Exception e){
            System.out.println(e);

        }
    }
}
