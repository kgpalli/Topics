package miscillaneous;

import java.util.Collections;

public class SwapIntegers {
    public static void main(String[] args) {
// swap two integers in an array
        int []num = new int[]{1,2,3,4,5};
       int k=num[1];
        num[1]=num[3];
        num[3]=k;
for(int i=0;i<num.length;i++)
System.out.println(num[i]);

// swap two numbers without third variable
/*

        int x=12;
        int y=14;
        x= x+y;
        y=x-y; // always first delete y from x
        x=x-y;

        System.out.println(x);
        System.out.println(y);
*/


    }
}
