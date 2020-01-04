package hackerRank2;

import java.util.Scanner;

/*
* Learn regular expressions
*
* [01]?\d{1,2}  matches numbers 0-199
* 2[0-4]\\d      matches numbers 200-249
*25[0-5]         matches numbers 200-255
*
* INPUT   :
* 000.12.12.034
121.234.12.12
23.45.12.56
00.12.123.123123.123
122.23
Hello.IP

OUTPUT
true
true
true
false
false
false
*
* */



public class MyRejex21 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        while(in.hasNext())
        {
            String IP = in.next();

            System.out.println(IP.matches(new MyRegex().pattern));
        }
        }
}

class MyRegex{

    String num = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";

String pattern = num +"."+num +"."+ num + "."+num ;



}
