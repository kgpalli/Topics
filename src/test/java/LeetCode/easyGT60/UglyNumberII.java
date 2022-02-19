package LeetCode.easyGT60;
/*
* An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
*Example 1:

Input: n = 10
Output: 12
Explanation: [1, 2, 3, 4, 5, 6, 8, 9, 10, 12] is the sequence of the first 10 ugly numbers.
Example 2:

Input: n = 1
Output: 1
Explanation: 1 has no prime factors, therefore all of its prime factors are limited to 2, 3, and 5.
* */

public class UglyNumberII {

    public static int nthUglyNumber(int n) {

        int [] nums = new int[1690];
         nums[0]=1;
         int ugly=0,i2=0,i3=0,i5=0;

         for(int i=0;i<1690;i++){
             nums[i] = Math.min(Math.min(nums[i2] * 2,nums[i3]*2),nums[i5] * 2);
             ugly = nums[i];
             if(ugly == nums[i2] * 2) i2++;
             if(ugly == nums[i3] * 3) i3++;
             if(ugly == nums[i5] * 5) i5++;
         }

         return nums[n-1];

    }


    public static void main(String[]args){
        int num = 10;

        System.out.println(nthUglyNumber(num));


    }
}
