package nopatterns;

public class Pattern5 {

    /*      7 6 5 4 3 2 1
            7 6 5 4 3 2
            7 6 5 4 3
            7 6 5 4
            7 6 5
            7 6
            7*/
    public static void main(String[] args) {

        int num = 7;

        for(int i=1;i<=num;i++)
        {
            for(int j=num;j>=i;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }


        }




}
