package geeksforgeeks;

public class ExtractIntegers {



    public static void main(String[] args) {

     String str = "geeksforgeeksA-118Sector-136";

// MTHOD 1
     /*for(int i=0;i<str.length();i++)
     {
         char ch = str.charAt(i);

         if(Character.isDigit(ch))
         {
             int sum = Character.getNumericValue(ch);

             System.out.print(sum);
         }
     }*/

     // METHOD - 2


// Replacing every non-digit number with a space(" ")

        str = str.replaceAll("[^\\d]"," ");


// Remove extra spaces from the beginning  and the ending of the string
        str = str.trim();
        // Replace all the consecutive white  spaces with a single space

        str = str.replaceAll(" +", " ");
        if (str.equals(""))
            str= "-1";


        System.out.println(str);
    }


}
