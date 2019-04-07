package miscillaneous;

public class PrimeNumber {

    public static void main(String[] args) {

        int num = 13;
        int m= num/2; // m=6
       int flag = 0;
        if((num==1) || (num==0))
        {
            System.out.println("num is not a prime number");
        }

        else
        {
            for(int i=2;i<=m;i++)  // iterates till 6
            {
              if(num%i==0) // it leaves 3 as a remainder
              {
                  System.out.println(num+ "num is not a prime number");
                  flag=1;
              }
            }if(flag==0)
        {
            System.out.println(num+ "num is  a prime number");
        }
        }






        }
}
