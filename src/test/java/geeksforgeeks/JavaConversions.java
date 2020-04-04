package geeksforgeeks;

import org.testng.annotations.Test;

public class JavaConversions {

    public static String convertFloatToString(float floatValue){

        // Convert float value to String value using + operator method



        String stringValue = " "+floatValue;

        // Convert float value to String value using valueOf() method

        /* Convert double to String
        String stringValue = "" + doubleValue;
        * */

        /*
        * Convert byte to String
        *  String stringValue = "" + byteValue;
        *
        * */
       // return String.valueOf(floatValue);

        return stringValue;

    }

    public static float convertStringToFloat(String stringValue){

        // Convert float value to String value using + operator method

        // Convert string to float using parseFloat() method

        return Float.parseFloat(stringValue);

        /*
        * Convert String to short
        * return Short.parseShort(stringValue)
        * */

        /*
         * Convert String to Byte
         * return Byte.parseByte(stringValue)
         * */

    }



    public static void main(String[] args) {

        String stringValue;
        float floatValue = 1;

        stringValue = convertFloatToString(floatValue);
        System.out.println(stringValue);


        // Convert String to Float

        /*
        * String stringValue = "1.0"
        *float floatValue
        *floatValue = convertFloatToString(stringValue)
        * System.out.println(floatValue);
        * */


        // Convert


        }

    @Test
    public void ConvertBooleanToInteger() {

        // boolean to integer
        int intValue ;
        boolean bolValue=false;

        // Check if it's boolean give int value
        if (bolValue) {
            intValue = 1;
        } else {
            intValue = 0;
        }
        System.out.println(intValue);
    }

    @Test
    public void ConvertIntegerToBoolean() {

        // Integer to boolean
        int intValue = 1;
        boolean bolValue;

        // Check if it's greater than equal to 1
        if (intValue >= 1) {
            bolValue = true;
        } else {
            bolValue = false;
        }
        System.out.println(bolValue);
    }
    @Test
    public void ConvertCharToInt() {

        // char to int using ASCII value - Method 1
        /*Using ASCII values: This method uses TypeCasting to get the ASCII value of the given character.
        From this ASCII value, the respective integer is calculated by subtracting it from the ASCII value of 0.
        In other words, this method converts the char to int by finding the difference of the ASCII value of this char and
        ASCII value of 0.*/
        char ch = '1';
        int i = ch - '0';
        System.out.println("int value is " + i);

      //  char to int using String.valueOf() - Method 2

        char ch2 = '2';
        int i2 = Integer.parseInt(String.valueOf(ch2));
        System.out.println("int value for i2  is " + i2);

        //  using Character.getNumericValue()   = Method 3

        char ch3 = '3';
        int i3 = Character.getNumericValue(ch3);
        System.out.println("int value for i3  is " + i3);




    }

}

