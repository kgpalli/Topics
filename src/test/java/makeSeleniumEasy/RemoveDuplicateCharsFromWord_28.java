package makeSeleniumEasy;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharsFromWord_28 {


    public static void main(String[] args) {

        String userInput = "abcabcabcabc";

        /*
         * Since we need to check for duplicate chars in word, we must need to extract
         * each char of word. And the best way is to convert in to char array.
         */

        char[] ch = userInput.toCharArray();
        /*
         * Since we need to remove duplicates and maintain the insertion order as well,
         * we will use LinkedHashSet with Generic as Character.
         */

        StringBuilder sb = new StringBuilder();
        LinkedHashSet<Character> charWithoutDuplicates = new LinkedHashSet<>();

        /*
         * Iterate char array and add in to container. Duplicate will not be added.
         */

        for (Character c : ch)

            charWithoutDuplicates.add(c);
        System.out.println(charWithoutDuplicates);

        /*
         * We need to create word by appending all unique characters in sequence. SInce
         * String is immutable, we need to use StringBuilder or StringBuffer.
         */

        for (Character finalOutput : charWithoutDuplicates)

            sb.append(finalOutput);


        System.out.println("The Unique characters are : " + sb.toString());


    }
}