package makeSeleniumEasy;

public class ReverseEveryCharOfWordOfString {
    /*
     * This method splits given string by space delimiter and returns a String
     * array.
     */

    public static String[]splitStringBySpace(String inputStringToSplit)
    {
        return inputStringToSplit.split(" ");
    }

    public static String reverseWord(String inputWord)
    {
        String reverse=" ";
        for(int i=inputWord.length()-1;i>=0;i--)
        {
            reverse = reverse+inputWord.charAt(i);
        }

        return reverse;
    }



    public static void main(String[] args) {

      String str = "reverse the string";

      String [] str1 = splitStringBySpace(str);

      String desiredString = " ";



      for(int j=0;j<str1.length;j++)
      {

          desiredString = desiredString+reverseWord(str1[j])+" ";
      }

      System.out.print(desiredString);







    }




}
