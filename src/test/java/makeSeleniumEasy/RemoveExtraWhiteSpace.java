package makeSeleniumEasy;

public class RemoveExtraWhiteSpace {
    /**
     We have trim method which only removes leading and trailing whitespace/s of given string. We do not have any readymade methods to remove white spaces between words.
     We need to create a char array from given string which we need to iterate.
     If char at given index is a non space char, append it to result string.
     If char at given index is a white space, check if resultant string is zero in length. If length of resultant string is zero, go to next iteration.
     We need to go to next iteration as we do not want any leading white spaces in our resultant string. If length of resultant string is not zero, check if next index char is non space. If it is non space, append char to resultant string else to next iteration.
     */

    public static void main(String[] args) {

String str = "string   to   trim extra   whitespaces";

char[]val = str.toCharArray();

int strLength = str.length();

// Output string variable
        String stringWithoutExtraWhitespaces = "";

        for(int i=0;i<strLength;i++)
        {
            // If current char is a whitespace, check for next char

            if(val[i] == ' ')
            {
                if(!(stringWithoutExtraWhitespaces.length() == 0))
                {

                    // Check if next char is a non space. If yes, append in existing string
                    if(val[i+1]!=' ')
                    {
                        stringWithoutExtraWhitespaces = stringWithoutExtraWhitespaces+val[i];
                    }
                }
            }else
                stringWithoutExtraWhitespaces = stringWithoutExtraWhitespaces+val[i];
        }

        System.out.println("stringWithoutExtraWhitespaces = " + stringWithoutExtraWhitespaces);




    }



}
