package hackerrank;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PrintThirdChar {


    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int input = sc.nextInt();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int[]arr = new int[input];
       /*int num=10;
       for(int i=0;i<=num;i++)
       {
           if(i%3 != 0)
           {
              System.out.println(i);
           }
       }*/

      String[]arrItems = sc.nextLine().split(" ");
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
       for(int i=0;i<input;i++)
       {
           int arrItem = Integer.parseInt(arrItems[i]);
           arr[i] = arrItem;

       }

       for(int i=input-1;i>=0;i--)
       {
           System.out.print(arr[i]+" ");
       }
       sc.close();


       }


}
