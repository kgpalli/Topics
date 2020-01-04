package hackerrank;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderPractice {

    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE,0); // it prints current date
        //cal.add(Calendar.DATE,30)  -> it prints date after a month
        System.out.println(cal.getTime());

        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        String formatted = format1.format(cal.getTime());

        System.out.println(formatted);



    }




}
