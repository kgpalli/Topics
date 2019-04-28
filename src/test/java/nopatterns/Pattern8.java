package nopatterns;

public class Pattern8 {
         /* 1 2 3 4 5 6 7
            1 2 3 4 5 6
            1 2 3 4 5
            1 2 3 4
            1 2 3
            1 2
            1
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5
            1 2 3 4 5 6
            1 2 3 4 5 6 7
*/
    public static void main(String[] args) {

        int num = 5;

        for (int i = num; i >=1; i--) { // i starts from 5 after ieration it reduces prints 5,4,3,2,1
            for (int j = 1; j<=i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for(int i=1;i<=num;i++)
        {
            for(int j=1; j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }



}
