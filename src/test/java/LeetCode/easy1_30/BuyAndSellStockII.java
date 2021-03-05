package LeetCode.easy1_30;

	/*Input: prices = [7,1,5,3,6,4]
    Output: 7
    Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
    Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.*/


public class BuyAndSellStockII {

    public static int maxProfit(int[] prices) {
     int max_profit=0;
     int valley=prices[0];
     int peak = prices[0];
     int i=0;
     while(i<prices.length-1){
         System.out.println(prices[i]);
         while(i<prices.length-1 && prices[i] >= prices[i+1])
             i++;
             valley=prices[i];
             while(i<prices.length-1 && prices[i] <= prices[i+1])
             i++;
             peak = prices[i];
             max_profit += peak - valley;

     }
     return max_profit;
    }

    public static void main(String[]args){
        int [] prices = {7,1,5,3,6,4};

        System.out.println(maxProfit(prices));

    }

}
