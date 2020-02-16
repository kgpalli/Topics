package hackerRank2;

import java.util.Scanner;
/*
* QUESTION :He is a very very good boy, isn't he?
* Ans : 10
He
is
a
very
very
good
boy
isn
t
he
* */

public class StringTokens {

    public static void main(String args[]) {


        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String [] items = s.trim().split("[ !,?.\\\\_'@]+"); // + symbol helps to append the next word

        if (s == null || s.trim().equals(""))
        {
          System.out.println("0");
        }else if(items.length>400000)
        {
            return;
        }else
        {
            System.out.println(items.length);
        }
        for(String item :items )
        {
            System.out.println(item);
        }





    }
}
