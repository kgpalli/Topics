package LeetCode.easyGT60;

import java.util.Calendar;

public class DayOfTheYear {
    public static int dayOfYear(String date) {
       /* int numOfDays = 0;
        String[]str = date.split("-");
        Calendar cal = Calendar.getInstance();
        int year = Integer.parseInt(str[0]);
        int month = Integer.parseInt(str[1]);
        int day = Integer.parseInt(str[2]);
        cal.set(year,month-1,day);
        numOfDays = cal.get(Calendar.DAY_OF_YEAR);
        return numOfDays;*/


        String[] data = date.split("-");
        int[] months = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int currentMonth = Integer.parseInt(data[1]);
        int currentDay = Integer.parseInt(data[2]);
        int currentYear = Integer.parseInt(data[0]);


        if (currentYear%4==0 && currentYear%100!=0){
            months[1] = 29;
        }
        else
        if (currentYear%400==0){
            months[1] = 29;
        }

        else months[1] = 28;


        if(currentMonth == 1)
        {
            return currentDay;
        }

        else

            for(int i=0; i<currentMonth-1; i++){
                currentDay+=months[i];
            }

        return currentDay;

    }



    public static void main(String[]args){

        String date = "2019-01-09";
       System.out.println(dayOfYear(date));


    }



}
