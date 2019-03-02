package forloop1;

public class ReplaceVowel {
    public static void main(String[] args) {

        String str = "Java is Fun";
        String replace = "";
        int i=0;
// Using while loop
        while(i<str.length())
        {
            if(str.charAt(i)==('a') || str.charAt(i) ==('e')|| str.charAt(i) ==('i')|| str.charAt(i) ==('o')|| str.charAt(i) ==('u'))
            {
                replace += "x";
            }else
            {
                replace += str.charAt(i);
            }
            i++;
        }

        /*for(int i=0; i<str.length();i++)
        {
            if(str.charAt(i)==('a') || str.charAt(i) ==('e')|| str.charAt(i) ==('i')|| str.charAt(i) ==('o')|| str.charAt(i) ==('u'))
            {
                replace += "x";
            }else
            {
                replace += str.charAt(i);
            }
        }*/


        System.out.println(replace);
    }
}
