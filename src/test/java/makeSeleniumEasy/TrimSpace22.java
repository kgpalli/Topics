package makeSeleniumEasy;

public class TrimSpace22 {
    /**

     “trim()” method of String class trims leading and trailing whitespace/s of given string. It does not remove whitespace between words. We need to write logic to do so.

     Logic step by step:
     We need to find first index of non space char in given string from beginning. Say it First.
     We need to find first index of non space char in given string from end. Say it Last.
     Return a substring indexing from First till Last.
     Detailed Explanation:
     Assume first char of given string is a non space char and set starting index of non space char as zero. Now check if it is really a non space char. If it it, finalize starting index as zero else increment index by one and repeat the same till you get a non space char.
     Assume last char of given string is a non space char and set last index of non space char as (Length of String-1). Now check if it is really a non space char. If it it, finalize end index as (Length of String-1) else decrement index by one and repeat the same till you get a non space char.
     Once Starting and Ending index are finalized, get the substring.
     */


    public static void main(String[] args) {

String str = "    Please enter the string to trim spaces   ";

        // Assume 0th index is non-space character

        int startNonSpaceIndex = 0;
// Assume last index is non-space character
        int endNonSpaceIndex =str.length()-1;
// Store length in a variable
        int strLength = str.length();

        char[]val = str.toCharArray();


        // Increment startNonSpaceIndex by one until you really find a non space char
        while(startNonSpaceIndex<strLength && val[startNonSpaceIndex]==' ')
        {
            System.out.println("The value is " + val[startNonSpaceIndex]);
            startNonSpaceIndex++;
        }
 // Decrement endNonSpaceIndex by one until you really find a non space char
        // Since we know starting index of a non space char, so we should not exceed
        // that which
        // is taking care by (startNonSpaceIndex &lt; endNonSpaceIndex)


        while(startNonSpaceIndex<endNonSpaceIndex && val[endNonSpaceIndex]==' ')
        {
            endNonSpaceIndex--;
        }

// Now you have actual starting and ending index of non space char in given string
       System.out.println(str.substring(startNonSpaceIndex,endNonSpaceIndex+1));







    }

}
