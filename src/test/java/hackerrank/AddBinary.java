package hackerrank;


import java.util.Scanner;

public class AddBinary {


    public static void main(String[] args) {


      Scanner sc = new  Scanner(System.in);

      int n = sc.nextInt();
      int counter =0, max=0;
     while(n>0)
     {
         int rem = n%2;
        if(rem==1)
            counter++;
        else
            counter=0;

        max = Math.max(counter,max);
        n = n/2;

     }
     System.out.println(max);

    }


}
