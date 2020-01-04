package array1;

public class UniqueArrWithoutColl {

    /*
     * Since we need to check for duplicate chars in word, we must need to extract
     * each char of word. And the best way is to convert in to char array.
     * Ans : abc
     */

    public static void main(String[] args) {

        String  str = "abcabcabc";


        char[]c = str.toCharArray();
        // Since we need to modify content of String, we will create an empty string using StringBuilder
        StringBuilder stringWithoutDuplicates = new StringBuilder();
        for(char ch: c)
        {
            // StringBuilder does have contains method. We can use indexOf method as an alternative
            if(stringWithoutDuplicates.indexOf(Character.toString(ch))==-1)
            {
                stringWithoutDuplicates = stringWithoutDuplicates.append(ch);
            }
        }

        System.out.println(stringWithoutDuplicates);


    }
}
