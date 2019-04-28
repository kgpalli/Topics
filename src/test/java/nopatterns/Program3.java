package nopatterns;

public class Program3 {

            /*1
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5
            1 2 3 4 5 6
            1 2 3 4 5 6 7
            1 2 3 4 5 6
            1 2 3 4 5
            1 2 3 4
            1 2 3
            1 2
            1*/
    public static void main(String[] args) {
        int num=7;
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();


        }
        for(int i=num-1;i>=1;i--)
        {
            for(int j=1;j<=i;j++) // 1= 1 to 6, 2=1 to 5, 3=1to4
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println();

    }
}
