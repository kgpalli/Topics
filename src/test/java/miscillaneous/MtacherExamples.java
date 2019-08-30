package miscillaneous;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MtacherExamples {

    /*The Matcher lookingAt() method works like the matches() method with one major difference.
            The lookingAt() method only matches the regular expression against the beginning of the text,
    whereas matches() matches the regular expression against the whole text. In other words, if the regular expression matches the beginning of a text but not the whole text,
    lookingAt() will return true, whereas matches() will return false.*/

    /*
    find() + start() + end()
The Matcher find() method searches for occurrences of the regular expressions in the text passed to the Pattern.matcher(text) method, when the Matcher was created. If multiple matches can be found in the text,
the find() method will find the first, and then for each subsequent call to find() it will move to the next match.

The methods start() and end() will give the indexes into the text where the found match starts and ends.
Actually end() returns the index of the character just after the end of the matching section. Thus, you can use the return values of start() and end() inside a String.substring() call.

    */

    public static void main(String[] args) {

        String text = "This is the text to be searched " +
                "for occurrences of the http:// pattern.";

        String patternString = ".*http://.*";

        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);

        System.out.println("matcher value is " + matcher );


        // matches()


        System.out.println("matches value is " + matcher.matches() );

        // lookingat
        System.out.println("lookingat value is " +matcher.lookingAt());


//  Matcher find(), start() and end() example

        String text2 = "This is the text which is to be searched " +
                "for occurrences of the word 'is'.";

        String patternString2 = "is";

        Pattern pattern2 = Pattern.compile(patternString2);
        Matcher matcher2 = pattern2.matcher(text2);

        int count = 0;
        while(matcher2.find())
        {
            count++;

            System.out.println("found: " + count + " : " + matcher2.start() + "_ " + matcher2.end());
        }





    }


}
