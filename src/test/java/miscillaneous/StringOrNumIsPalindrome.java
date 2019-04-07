package miscillaneous;

public class StringOrNumIsPalindrome {

    public static void main(String[] args) {

        String str = "malayalam";
        String str1 = ""; // no space between double quotes

        for (int i =str.length()-1; i>=0;i--)
        {
            str1= str1+str.charAt(i);

            }
        if(str.equals(str1))
        {
            System.out.println("String is a palindrome");
        }else{
        System.out.println("String is not a palindrome");}

    }

}
