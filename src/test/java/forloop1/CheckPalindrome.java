package forloop1;

public class CheckPalindrome {

    public static boolean process(String str)
    {

        String result="";
        boolean status = false;

//        for(int i=str.length()-1;i>=0;i--)
//        {
//            result = result+str.charAt(i);
//
//            }

        int i=str.length()-1;
        do{
            result = result+str.charAt(i);
            i--;
        }while(i>=0);
        if(str.equals(result))
        {
            status=true;
        }

        return status;

    }
    public static void main(String[] args) {
        String str = "ABCBA";

        boolean isPalindrome= CheckPalindrome.process(str);
        if(isPalindrome)
        {
            System.out.println("String " + str + " is a Palindrome");
        }else
        {
            System.out.println("String " + str + " is not a Palindrome");
        }
    }
}
