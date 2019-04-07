package strings;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {


        String str = "Learning Java is fun";

        str = str.replaceAll("\\s", "");

        System.out.println(str);

        //remove all white spaces from a string without using replace().

        String str1 = "tik tak tik all the way";
        char[] ch = str1.toCharArray();
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < ch.length; i++) {

            if ((ch[i] != ' ') && (ch[i] != '\t')) {

                sb = sb.append(ch[i]);
            }
        }


        // camel case

        String str2 = "learn camel case in java";
        //  extract all words , split at white spaces \\s+
        String[] words = str2.split("\\s+");
        // to modify the string
        StringBuffer sb1 = new StringBuffer();

        for (String s : words) {
            // extracting first char

            char firstChar = s.charAt(0);
            if (!Character.isUpperCase(firstChar)) {
                sb1.append(Character.toUpperCase(firstChar)).append(s.substring(1));
            } else {
                sb1.append(s.substring(0));
            }
            }
        System.out.println("String with camelcase : " + sb1 + "");
    }

}
