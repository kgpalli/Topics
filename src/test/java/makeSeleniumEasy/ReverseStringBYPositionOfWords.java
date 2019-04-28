package makeSeleniumEasy;

import java.util.Scanner;

public class ReverseStringBYPositionOfWords {

    public static String[]splitStringBySpace(String inputStringToSplit)
    {
        return inputStringToSplit.split(" ");
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to be reversed");
        String userInput = sc.nextLine();
      // Split string
        String [] splittedString=splitStringBySpace(userInput);

    // Output with each word reversed
        String desiredString = "";


        // Reversing word by word and appending
        for(int i=splittedString.length-1;i>=0;i--)
        {
            desiredString = desiredString + splittedString[i]+" ";
        }

        System.out.println(desiredString);


    }




}
