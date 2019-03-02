package forloop1;

public class DoWhileStringReverse {

    public static String process(String str)
    {

        String replace = "";
        int i= str.length()-1;

        do {
            replace += str.charAt(i);
            i--;

            }while(i>=0);

        return replace;
        }





    public static void main(String[] args) {



        String str = "Java is Fun";

        String result = DoWhileStringReverse.process(str);

        System.out.println(result);

    }


}
