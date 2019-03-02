package miscillaneous;

import java.util.Scanner;

public class VerifyPositiveNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input Number");
        int input = sc.nextInt();
        if(input>0)
        {
            System.out.println("Positive Number");
        }else if(input<0)
        {
            System.out.println("Negative Number");
        }else
        {
            System.out.println("Number is Zero");
        }




    }
}
