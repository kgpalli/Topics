package makeSeleniumEasy;

public class PositionOfLetterInAlphabet {
    // ASCII values for A TO Z = 65 to 90
    // ASCII values for a to z = 97 to 122


    public static void main(String[] args) {

        char inputLetter = 'd';
        // converting input letter in to uniform case.
        char inputLetterToLowerCase = Character.toLowerCase(inputLetter);
        int index = inputLetterToLowerCase;
        System.out.println(index); // it return asccii value of char
        // COnverting chat in to its ascii value
        int asciiValueOfInpuChar = (int)inputLetterToLowerCase;
        // ASCII value of lower case letters starts from 97
        int position = asciiValueOfInpuChar-96;
        System.out.println(position);










    }
}
