package makeSeleniumEasy;

public class PrintDistinctCharInString30 {
    public static void main(String[] args) {

        String inputString = " Make Selenium Easy";

        String userInput = " Make Selenium Easy";

        userInput = userInput.toLowerCase();

        userInput = userInput.replace(" ","");

        while(userInput.length()>0) {
            char ch = userInput.charAt(0);

            if (userInput.lastIndexOf(ch) == 0) ;

                System.out.print(ch + " ");

                userInput = userInput.replace(Character.toString(ch), "");


        }

        // Converting input string to upper case
            inputString = inputString.toUpperCase();

            // Removing all white spaces
            inputString = inputString.replace(" ", "");

            // We need to keep counting char till its length is greater than 0
            while (inputString.length() > 0) {
                // Extracting first char
                char c = inputString.charAt(0);
                /*
                 * lastIndexOf(char c) method of String class gives the index of last occurrence of char in given string.
                 * If a character is not repeated in given string,&nbsp; lastIndexOf should give zero as we took first char to check.
                 * If it is zero, print.
                 */
                if (inputString.lastIndexOf(c) == 0)
                    System.out.println( c + " ");

                // Remove char whose occurrence is checked
                inputString = inputString.replace(Character.toString(c), "");
            }

        }


}
