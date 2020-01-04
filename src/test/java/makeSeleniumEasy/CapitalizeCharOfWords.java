package makeSeleniumEasy;

public class CapitalizeCharOfWords {

    /**
     * note : it capitalizes the first char of each word
     * A sentence is a collection of words generally separated by a white space. We can extract words of given sentence using split method.
     * Now extract first character of first word and check if it is not uppercase already.
     * If it is not, convert first char to upper case and append remaining characters of word. we can use subString method.
     * If it is already in uppercase, append entire word. AT last append a whitespace. Repeat the same for all words.
     *   Ans : MakeSeleniumEasy123
     * @param args
     */


    public static void main(String[] args) {

        String str = "make selenium easy 123";

        // String str = "Make Selenium Easy 123";

        String[] words = str.split("\\s+");


// Creating an empty string of type StringBuilder so that modification of string is possible.

        // str = str.replaceAll("\\s","");

        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            char firstChar = word.charAt(0);

            if (!Character.isUpperCase(firstChar)) {
                sb.append(Character.toUpperCase(firstChar) + word.substring(1));
            } else {

                sb.append(word.substring(0));
            }

            sb.append("");
        }
        //

        String result = sb.toString().trim();
        System.out.println(result);


    }
}




