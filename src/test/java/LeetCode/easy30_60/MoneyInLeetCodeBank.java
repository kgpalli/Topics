package LeetCode.easy30_60;

public class MoneyInLeetCodeBank {

    public static int totalMoney(int n) {

        int money=0;
        int constantMoney=0;

        int fullWeeks = n/7;
        int extraDays = n;


        if(n>7){
            extraDays = n % 7;
        }
        System.out.println(fullWeeks + " =  full weeks ");
        System.out.println(extraDays + " =  extraDays ");


        money = fullWeeks * 28;

        System.out.println(money + " =  Money ");
        for(int i=0;i<fullWeeks;i++){
            constantMoney = constantMoney + (7*i);
        }

        for(int i=0;i<=extraDays;i++){
            money = money + i + fullWeeks;
        }

        return money + constantMoney;

    }

    public static void main(String[]args){

     int n = 20;
     System.out.println(totalMoney(n));


    }
}
