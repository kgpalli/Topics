package makeSeleniumEasy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class MissingAlphabets {
    public static void main(String[] args) {

        String userInput = "akihl malhotra";

// Replacing whitespace to empty as we are concerned about alphabets
        userInput = userInput.replaceAll(" ", "");


        // Creating a String array containing each character of user input
        String[] inputStringArray = userInput.split("");

        String[] alphabetstring = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");


// Creating HashSet to find intersections

        HashSet<String> set1 = new HashSet<String>(Arrays.asList(inputStringArray));
        HashSet<String> set2 = new HashSet<String>(Arrays.asList(alphabetstring));


        System.out.println(set1 + "userInput in string is ");
        System.out.println(set2 + "alphabet string is ");
// Intersection of above sets
        set2.removeAll(set1);

        System.out.println(set2 + "Missing alphabets ");


        // OR

        String alphabets = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String userInput2 = "anil malhotra";




        userInput2=userInput2.replaceAll(" ", " ");
        LinkedHashMap map=new LinkedHashMap();
        for(int i=0;i<userInput.length();i++)
        {

            if(!map.containsKey(userInput.charAt(i)))
            {

                map.put(userInput.charAt(i),1);
            }

        }
        System.out.println("Missing Alphabets – ");
        for(int i=0;i<alphabets.length();i++)
        {
            if(map.get(alphabets.charAt(i)) == null)
            {
                System.out.print(alphabets.charAt(i)+" ");
// if you want to store in arraylist or some other collection class u can do that i am just printing
            }
        }

    }
}





