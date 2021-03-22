package LeetCode.easy30_60;

/**
 * 	Input: n = 20
 * Output: 96
 * Explanation: After the 20th day,
 * the total is (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4 + 5 + 6 + 7 + 8) + (3 + 4 + 5 + 6 + 7 + 8) = 96.
 * */

public class MoneyInLeetCodeBank {

    public static int totalMoney(int n) {

        int money=0;
        int constantMoney=0;

        int fullWeeks = n/7;
        int extraDays = n;


        if(n>7){
            extraDays = n % 7;
        }
        money = fullWeeks * 28;

        for(int i=0;i<fullWeeks;i++){
            constantMoney = constantMoney + (7*i);
        }

        for(int i=1;i<=extraDays;i++){
            money = money + i + fullWeeks;
        }

        return money + constantMoney;

    }

    public static void main(String[]args){

     int n = 10;
     System.out.println(totalMoney(n));


    }
}
