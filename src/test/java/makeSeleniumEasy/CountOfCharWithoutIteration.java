package makeSeleniumEasy;

import java.util.HashMap;

public class CountOfCharWithoutIteration {

    /*FInd the initial length of given string.
    Replace desired char by empty character.
    Find the length of string after replacement.
    FInd the difference between initial and current length.
    The difference is occurrence of asked char in string.*/



    public static void main(String[] args) {

String str = "Autoation Tester";

System.out.println(str.length());

System.out.println(str.replace("e",""));


//str.length() = 16,  str.replaceAll("e","").length() = 14, it's the length after replacing 'e'

int iniLength = str.length() - str.replaceAll("e","").length();

System.out.println(iniLength);


// with hash map with iteration


String str2 = "Programming";

        HashMap<Character,Integer> hm = new HashMap<>();

        for(char s : str2.toCharArray() )
        {
          if(hm.containsKey(s))
          {
              int value = hm.get(s);
              hm.put(s,value + 1);
          }else
          {
              hm.put(s,1);
          }
        }

        System.out.println(hm);

System.out.println("The count is " +countNum("Make",' '));

        }

public static int countNum(String st, char ch)
{
    return st.length() ==0 ? 0 : (st.charAt(0)==ch?1:0)+ countNum(st.substring(1),ch);
}



}
