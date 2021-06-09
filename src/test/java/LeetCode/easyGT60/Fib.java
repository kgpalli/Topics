package LeetCode.easyGT60;

/**
 * F(0) = 0, F(1) = 1
 * F(n) = F(n - 1) + F(n - 2), for n > 1.
 * Given n, calculate F(n).
 *
 *
 *
 * Example 1:
 *
 * Input: n = 2
 * Output: 1
 * Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
 * Example 2:
 *
 * Input: n = 3
 * Output: 2
 * Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
 * Example 3:
 *
 * Input: n = 4
 * Output: 3
 * Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
 *
 * */
public class Fib {
    public static int fib(int n) {
        if(n<=1){
            return n;
        }
        if(n==2){
            return 1;
        }
        int total=0;
        int prev1=1;
        int prev2=1;
        for(int i=3;i<=n;i++)
        {
          total = prev1 + prev2;
          prev2=prev1;
          prev1=total;
        }

        return total;
    }


    public static void main(String[]numbers){
        int n=3;
        System.out.println(fib(n));


    }
}
