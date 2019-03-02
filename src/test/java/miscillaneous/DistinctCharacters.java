package miscillaneous;

import java.util.Arrays;

public class DistinctCharacters {

    static final int NO_OF_CHARS = 256;

    public static void main(String[] args) {

        String str = "sjkbscfehjbfn";

        // convert input string to upper case
        str = str.toUpperCase();
        // Remove all white spaces
        str = str.replace("", "");
        // keep counting char till its length is greater than 0
        while (str.length() > 0) {
            /*lastIndexOf(char c) method of String class gives the index of last occurrence of char in given string.
             * If a character is not repeated in given string,&nbsp; lastIndexOf should give zero as we took first char to check.
             * If it is zero, print.*/
            char c = str.charAt(0);
            if (str.lastIndexOf(c) == 0)
                System.out.println(c + " ");
            // it will remove all characters after verifying the condition
            str = str.replace(Character.toString(c), "");

        }

        System.out.println(str);


        //  SOLUTION 2

        /*String str1 = "GeeksforGeeks";

        int[] count = new int[NO_OF_CHARS];
        for (int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i)!=' ')
                count[(int)str1.charAt(i)]++;
            int n = i;
            for (i = 0; i < n; i++)
                if (count[(int)str1.charAt(i)] == 1)
                    System.out.print(str1.charAt(i));
            }
*/

        // SOLUTION 3

        String str2 = "GeeksforGeeks";
        int n = str2.length();

        // count[x] is going to store count of character 'x' in str2. If x is not present, then it is going to store 0.
        int[] count1 = new int[NO_OF_CHARS];

        // index[x] is going to store index of character'x' in str2. If x is not present or x is more than once,
        //  then it is going to store a value (for example, length of string) that cannot be a valid index in str2[]
        int[] index = new int[NO_OF_CHARS];

        // Initialize counts of all characters and
        // indexes of distinct characters.
        for (int i = 0; i < NO_OF_CHARS; i++)
        {
            count1[i] = 0;
            index[i] = n; // A value more than any
            // index in str2[]
        }

        // Traverse the input string
        for (int i = 0; i < n; i++)
        {
            // Find current character and increment
            // its count
            char x = str2.charAt(i);
            ++count1[x];

            // If this is first occurrence, then set
            // value in index as index of it.
            if (count1[x] == 1 && x !=' ')
                index[x] = i;

            // If character repeats, then remove it
            // from index[]
            if (count1[x] == 2)
                index[x] = n;
        }

        // Since size of index is constant, below
        // operations take constant time.
        Arrays.sort(index);

        for (int i = 0; i < NO_OF_CHARS && index[i] != n;
             i++)
            System.out.print(str2.charAt(index[i]));

        // SOLUTION 4


        String str3 = "learnjava";

        for(int i=0;i<str3.length();i++)
        {
            for(int j=i+1;j<str3.length();j++)
            {
                if(str3.charAt(i)==str3.charAt(j))
                {
                    str3=str3.replace(Character.toString(str3.charAt(i)),"");

                }
            }

        }

        System.out.println(str3);
    }
}




