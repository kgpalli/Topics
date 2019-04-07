package makeSeleniumEasy;

public class VerifyPalindromeStringInbuilt {
    public static void main(String[] args) {

   String strOriginal = "AMMA";

   StringBuilder strReverse = new StringBuilder(strOriginal).reverse();

   System.out.println(" strReverse is " + strReverse);

   // Since stringBuildr/Buffer do not override equals method so it will not check content
        // To verify content we can use valueOf method of String class. This method class toString() internally.

   if(String.valueOf(strOriginal).equals(String.valueOf(strReverse)))
   { System.out.println("1=Result is a palindrome"); }
   else { System.out.println("1=Result is  not a palindrome"); }

//Another way to verify content  using toString()


        if((strOriginal.toString()).equals(strReverse.toString()))
        { System.out.println("2=Result is a palindrome");
        }else
        { System.out.println("2=Result is  not a palindrome");

        }
// Using compareTo method

        if((strOriginal.toString()).compareTo(strReverse.toString()) == 0)
        { System.out.println("3=Result is a palindrome");
        }else
        { System.out.println("3=Result is  not a palindrome");

        }



    }
}
