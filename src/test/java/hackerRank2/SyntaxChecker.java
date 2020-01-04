package hackerRank2;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
/*
* 3
([A-Z])(.+)
Valid - Answer
[AZ[a-z](a-z)
Invalid - Anser
batcatpat(nat
Invalid - Answer
*
*
* */

public class SyntaxChecker {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0)
        {
            String pattern = in.nextLine();
            try{
                Pattern.compile(pattern);
                System.out.println("Valid");
            }catch (PatternSyntaxException e){
                System.out.println("Invalid");
            }
            testCases--;
        }











    }
}
