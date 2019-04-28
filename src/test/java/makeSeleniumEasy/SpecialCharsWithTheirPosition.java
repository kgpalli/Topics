package makeSeleniumEasy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpecialCharsWithTheirPosition {

    public static void main(String[] args) {

        String userinput = "Make%Selenium$Easy#";


        Pattern p = Pattern.compile("[ !\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]");

        Matcher m = p.matcher(userinput);
        // Iterating matcher
        int countOfSplChars = 0;

        while(m.find())
        {
            countOfSplChars = countOfSplChars+1;

            System.out.println(userinput.charAt(m.start())+ " at position " +(m.start()+1)+ ".");
        }
        System.out.println("Total special characters found:"+countOfSplChars);








    }
}
