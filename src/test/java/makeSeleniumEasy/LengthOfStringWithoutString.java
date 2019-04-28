package makeSeleniumEasy;

public class LengthOfStringWithoutString {



    /*Returns the index within this string of the last occurrence of the specified substring. The last occurrence of the empty string “” is considered to occur at the index value this.length().

    Highlighted in bold in above string is my solution actually.
    We will find last Index of an empty string (“”) which will give me length of actual string.
    Noter here, this method returns an index which starts from zero but here last occurrence of the empty string “” is considered to occur at the index value this.length().
*/

    public static void main(String[] args) {



        String str = "length cannot be negative";

        int count =str.lastIndexOf("");

        System.out.println("Print without length method, length is : " + count);

//OR
       System.out.println("Use length method, length is : " + str.length());











    }


}
