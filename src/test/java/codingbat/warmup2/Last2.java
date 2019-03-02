package codingbat.warmup2;

import org.apache.poi.util.SystemOutLogger;

public class Last2 {


    public static void main(String[]args)
    {
      String str = "xaxxaxaxx";

        if (str.length() < 2)
            System.out.println("0");
        // String end =str.length()-2 : int cannot be converted to string
        String end = str.substring(str.length()-2);
        // end = "xx"
        int count = 0;
        for (int i=0; i<str.length()-2; i++) {

            String sub = str.substring(i, i+2);
            // itr 1 = "xa", itr 2 = "ax", itr 3 = "xx", itr 4 = "xa", itr 5 = "ax", itr 6 = "xx"
            if (sub.equals(end)) {

                count++;

            }

        }
        System.out.println(count);

       // count = 1

    }

}
