package LeetCode.easy1_30;

import java.util.Arrays;

public class BuyAndSellStock {

    public static int maxProfit(int[] prices) {

        int max_profit = 0;
        int min = Integer.MAX_VALUE;
       for(int i=0;i<prices.length;i++){
          if(prices[i]<min){
              min = prices[i];
              System.out.println("Min is " + min);
          }else{
              max_profit = Math.max(max_profit, prices[i]-min) ;

              System.out.println("Max is " + max_profit);
          }

       }



        return max_profit;

    }




    public static void main(String[]args){
        int [] prices = {7,1,5,3,6,4};

        System.out.println(maxProfit(prices));

    }

}
