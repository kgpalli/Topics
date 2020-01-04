package makeSeleniumEasy;

import java.util.Scanner;

public class WordsInCircular_9 {

    /*
     * This method splits given string by space delimiter and returns a String
     * array.
     * Output: Selenium Easy Make
     */

    public static void main(String[] args) {

      /*  Scanner sc = new Scanner(System.in)  ;
        System.out.println("Enter words separated by space:");
        String input = sc.nextLine();
        System.out.println("Enter position:");
        int index = sc.nextInt();*/
        // Splitting input string in to string array

        String input = "Make Selenium Easy";
        int index=1;
        String inputArray[] = input.split(" ");
        // validation for acceptable index
        // index should be grater than or equal to zero and less than length of array
        if((index>=0)&&(index<inputArray.length))
                {
                    System.out.print("Output: ");

                    // Printing from given index till last index

                    for(int i=index;i<inputArray.length;i++) // index[1] = selenium, it prints Selenium and Easy
                    {
                        System.out.print(inputArray[i]+" ");
                    }
                    for(int k=0;k<index;k++) // it prints index 0
                    {
                        System.out.print(inputArray[k]+" "); // k prints Make
                    }
                    }else
        {
            System.out.println("Index is invalid.");
        }

        }
}
