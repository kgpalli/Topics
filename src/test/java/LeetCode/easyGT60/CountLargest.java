package LeetCode.easyGT60;
/**
 * Input: n = 13
 * Output: 4
 * Explanation: There are 9 groups in total, they are grouped according sum of its digits of numbers from 1 to 13:
 * [1,10], [2,11], [3,12], [4,13], [5], [6], [7], [8], [9]. There are 4 groups with largest size.
 *
 * Input: n = 2
 * Output: 2
 * Explanation: There are 2 groups [1], [2] of size 1.
 * */

public class CountLargest {

    public static int countLargestGroup(int n) {
        int output=0;
        int maxsize=0;
        int[] count=new int[37];
       for(int i=1;i<=n;i++){
           int num=i;
           int sum=0;
           while(num>0){
               sum += num % 10;
               num = num/10;
           }
           count[sum] = (count[sum])+1;
           maxsize = Math.max(maxsize,count[sum]);
       }
       for(int i : count){
           if(count[i]==maxsize){
               output++;
           }
       }

    return output;
    }


    public static void main(String[]args){
        int n= 13;
        System.out.println(countLargestGroup(n));
    }
}
