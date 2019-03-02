package forloop1;

public class PrimeNumberChecker {
    public static void main(String[] args) {

        int count=0;
// first for loop go till number 100
        for(int i=2;i<100;i++)
        {
          // second for loop always start with 2 and go till less than i
            for(int j=2;j<i;j++)
            {
                if(i%j!=0)
                {
                    count++;
                    //Ex: 1 = 5-2=3 will not print
                    if(count==i-2)
                    {
                        System.out.print(i+" ");
                    }
                }
            }
            count = 0;
        }

        }
}
