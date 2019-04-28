package makeSeleniumEasy;

import java.util.Scanner;

// first need to check whether the string has alphabets and numerics

public class ExtractNumbersFromString {
    public static void main(String[] args) {

        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a alphanumeric string : ");
        String inputByUser = sc.nextLine();

        System.out.println(" String entered by user : " + inputByUser);
        boolean flagregex = inputByUser.matches("([A-Za-z]+[0-9]|[0-9]+[A-Za-z])[A-Za-z0-9]*");


        // if string is alphanumeric, extract char and check if it is digit
        if (flagregex == true) {

            for (int i = 0; i < inputByUser.length(); i++) {
                char temp = inputByUser.charAt(i);
                if (Character.isDigit(temp)) {
                    sum = sum + Character.getNumericValue(temp);
                }
            }

            System.out.println("Sum of numbers found in : " + inputByUser + ": " + sum);
        } else {
            System.out.println(inputByUser);
        }

    }
}
