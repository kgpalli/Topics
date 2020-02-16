package hackerRank2.javaAdvanced;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/*
* input - 1, 2,3 ,4, 5, 6
* output - 1+2=3,  1+2+3 =6 , 1+2+3+4+5+6=21 */

public class TestVarArgs {

    public static void main(String[] args) {

        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n1 = Integer.parseInt(br.readLine());
            int n2 = Integer.parseInt(br.readLine());
            int n3 = Integer.parseInt(br.readLine());
            int n4 = Integer.parseInt(br.readLine());
            int n5 = Integer.parseInt(br.readLine());

            Add ob = new Add();
            ob.add(n1,n2);
            ob.add(n1,n2,n3);
            ob.add(n1,n2,n4);
            ob.add(n1,n2,n5);

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
 class Add {
    public void add(int... intArgs) {
        int sum = 0;
        String separator = "";
        for (int i : intArgs) {
            sum += i;
            System.out.print(separator + i);
            separator = "+";
        }
        System.out.println("=" + sum);
    }
}