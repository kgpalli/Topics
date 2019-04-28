package makeSeleniumEasy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrintSpecialCharacters21 {

    // The java.util.regex.Matcher class acts as an engine that performs match operations on a character sequence by interpreting a Pattern.
// Returns the offset after the last character matched. Returns the start index of the previous match.

    public static void main(String[] args) {

        String str = "special@chara#cters";

        // We know there are 33 special characters. So we will use them.
        Pattern p = Pattern.compile("[ !\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]");
        Matcher m = p.matcher(str);

        int countOfSpecialChars = 0;
        while(m.find())
        {
            countOfSpecialChars += 1;

            System.out.println(str.charAt(m.start()) + " m at position " + (m.start()+1) +" . ");
        }

        System.out.println("Count of Special chars" + countOfSpecialChars);

    }
}
