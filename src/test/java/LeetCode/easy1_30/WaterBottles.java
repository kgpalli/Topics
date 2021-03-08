package LeetCode.easy1_30;

/**
 *Input: numBottles = 9, numExchange = 3
 * Output: 13
 * Explanation: You can exchange 3 empty bottles to get 1 full water bottle.
 * Number of water bottles you can drink: 9 + 3 + 1 = 13.
 * */

public class WaterBottles {
    public static int numWaterBottles(int numBottles, int numExchange) {
     int sum = numBottles;
     if(numBottles<numExchange){
         return numBottles;
     }

     while(numBottles >= numExchange){

         int mod = numBottles % numExchange;
         numBottles /= numExchange;
         sum += numBottles;
         numBottles += mod;
     }

     return sum;
    }

    public static void main(String[]args){
        int numOfBottles = 15;
        int numOfExchange=4;

        System.out.println(numWaterBottles(numOfBottles, numOfExchange));



    }

}
