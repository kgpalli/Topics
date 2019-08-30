package makeSeleniumEasy;


/*Positive Divisor of a number N will be greater than or equal to 1 and less than or equal to number N.
        For Ex: Say Number is 4. Divisor of 4 will be 1,2 and 4.
        To get the divisor of a number N, we should divide N by all numbers in between 1 and N including 1 and N.
        We will use modulus operator which gives reminder. If reminder is zero, we can say given number is divisible by another number.
        For ex: 10%2= 0 (10 is divisible by 2 without a reminder)
        11%2=1 (11 is divisible by 2 with a reminder as 1)*/

public class FindDivisor {

    static void findAndPrintDivisors(int n)
    {
        for(int i=1;i<=10;i++)
        {
            if(n%i==0)
            {
                System.out.printf("%d ",i);
            }
        }
    }
    public static void main(String[] args) {


  int num=100;


   findAndPrintDivisors(num);


    }
}
