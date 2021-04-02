package LeetCode.easyGT60;
/**
 * Input: low = 3, high = 7
 * Output: 3
 * Explanation: The odd numbers between 3 and 7 are [3,5,7].
 *
 * Input: low = 8, high = 10
 * Output: 1
 * Explanation: The odd numbers between 8 and 10 are [9].
 * */
public class CountOddNumbers {
    public static int countOdds(int low, int high) {
       if(low % 2 ==0 && high % 2==0){
           return (high-low)/2;
       }
       return (high-low) / 2+1;
    }
    public static void main (String[]args){
        int low = 8;
        int high = 10;

     System.out.println(countOdds(low,high));

    }
}
