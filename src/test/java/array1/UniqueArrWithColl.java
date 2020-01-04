package array1;

import java.util.LinkedHashSet;

public class UniqueArrWithColl {

    /*
     * Since we need to check for duplicate chars in word, we must need to extract
     * each char of word. And the best way is to convert in to char array.
     * Ans: abc
     */

    public static void main(String[] args) {

        String  str = "abcabcabc";


        char[]c = str.toCharArray();


        /*
         * Since we need to remove duplicates and maintain the insertion order as well,
         * we will use LinkedHashSet with Generic as Character.
         */

        LinkedHashSet<Character>charGroup = new LinkedHashSet<>();
        for(Character ch: c)
        {
            charGroup.add(ch);
        }

        // Since we need to modify content of String, we will create an empty string using StringBuilder
        StringBuilder stringWithoutDuplicates = new StringBuilder();
        for(Character ch: charGroup)
        {
                stringWithoutDuplicates = stringWithoutDuplicates.append(ch);

        }

        System.out.println(stringWithoutDuplicates);


    }
}
