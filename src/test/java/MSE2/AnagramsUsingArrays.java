package MSE2;

import java.util.Arrays;

public class AnagramsUsingArrays {



    public static void main(String[] args) {


        String first = "Listen";
        String second = "Silent";
        first=first.toLowerCase();
        second=second.toLowerCase();
        boolean areAnagrams= true;

        if(first.length() != second.length())
        {
            areAnagrams = false;
        }

        char[]ch1 = first.toCharArray();
        char[]ch2 = second.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1,ch2))
        {
            areAnagrams = true;
        }else
        {
            areAnagrams = false;
        }

if(areAnagrams)
{
    System.out.println("Strings are anagrams");
}else
{
    System.out.println("Strings are not  anagrams");
}

    }
}
