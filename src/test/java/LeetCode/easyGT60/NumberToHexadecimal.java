package LeetCode.easyGT60;

import java.util.HashMap;

/**
 * All letters in hexadecimal (a-f) must be in lowercase.
 *Input:   26  output : "1a"
 * Input: -1 Output: "ffffffff"
 * */

public class NumberToHexadecimal {

    static String toHex(int num) {
        HashMap<Integer, Character> m = new HashMap<>();

        char digit = '0';
        char c = 'a';

        for (int i = 0; i <= 15; i++) {
            if (i < 10) {
                m.put(i, digit);
                digit++;
            }
            else {
                m.put(i, c);
                c++;
            }
        }

        // string to be returned
        String res = "";

        // check if num is 0 and directly return "0"
        if (num == 0) {
            return "0";
        }
        // if num>0, use normal technique as
        // discussed in other post
        if (num > 0) {
            while (num != 0) {
                res = m.get(num % 16) + res;
                num /= 16;
            }
        }
        // if num<0, we need to use the elaborated
        // trick above, lets see this
        else {
            // store num in a u_int, size of u_it is greater,
            // it will be positive since msb is 0
            int n = num;

            // use the same remainder technique.
            while (n != 0) {
                res = m.get(n % 16) + res;
                n /= 16;
            }
        }

        return res;
    }


    public static void main(String[]args){
        int x = 134, y = -1, z = -234;

        System.out.println("Hexa representation for" );
        System.out.println(x +" is " + toHex(x));
        System.out.println( y +" is " + toHex(y));
        System.out.println( z + " is " + toHex(z));
    }
}
