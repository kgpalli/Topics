package LeetCode.easyGT60;

public class DayOfTheWeek {

    public static String dayOfTheWeek(int day, int month, int year) {

        String []days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        int months[] = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};
        int sum = 4 + day + months[month-1] + (year - 1971);
        if(year >= 1972){
            sum += Math.ceil((year-1972) / 4.0);
        }
        if(year != 2100 && year % 4 == 0 && month > 2)
            sum++;

        return days[sum % 7];

    }

    public static void main(String[]args){

        int day = 31;
        int month = 3;
        int year = 2021;

        System.out.println(dayOfTheWeek(day,month,year));

    }

}
