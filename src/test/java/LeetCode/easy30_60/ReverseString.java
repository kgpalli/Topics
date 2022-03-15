package LeetCode.easy30_60;

import java.util.Arrays;

public class ReverseString {

    public static void reverseString(char[] s) {


        int a_pointer=0;
        int b_pointer=s.length-1;
        while(a_pointer<=b_pointer){
            char ch1 = s[b_pointer];
            s[b_pointer] = s[a_pointer];
            s[a_pointer] = ch1;
            a_pointer++;
            b_pointer--;

        }


        System.out.println(Arrays.toString(s));
    }


    public static void main (String[]args) {

        char[] s = {'H','a','n','n','a','h'};

        reverseString(s);

    }
}
