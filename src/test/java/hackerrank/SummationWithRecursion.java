package hackerrank;

public class SummationWithRecursion {


    public static int Summation(int n)
    {
        // Base case , we are at the end
        if(n<=0)
        {
            return 0;
        }
        // Reursive case : Keep Going
        else
        {
          /*
           3+ Summation(3-1)
          * 3+2 Summation(2-1)
          * 3+2+1 Summation(1-1), finally it returns 3+2+1
          * */


           return n + Summation(n-1);   //  Ans = 6
        }
    }

    public static int Factorial(int n)
    {
        // Base case , we are at the end
        if(n<=1)
        {
            return 1;
        }
        // Reursive case : Keep Going
        else
        {
            return n * Summation(n-1);  // Ans = 24
        }
    }

    public static int Exponentiation(int n,int p)
    {
        // Base case , we are at the end
        if(p<=0)
        {
            return 1;
        }
        // Reursive case : Keep Going
        // 5 * 3,

        else
        {
            return n * Exponentiation(n,p-1);  // Ans = 125, here n is always 5 , will be multiplied p times
        }
    }

    public static void main(String[] args) {

        System.out.println(Summation(3));
        System.out.println(Factorial(4));
        System.out.println(Exponentiation(5,3));




    }
}
