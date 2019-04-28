package nopatterns;

public class Pattern6 {

      /*    7
            7 6
            7 6 5
            7 6 5 4
            7 6 5 4 3
            7 6 5 4 3 2
            7 6 5 4 3 2 1*/

    public static void main(String[] args) {

        int num = 7;

        for (int i = num; i>=1; i--) {
            for (int j =num; j>=i; j--) { // 1=7, 2=7,6 3=7,6,5
                System.out.print(j + " ");
            }
            System.out.println();
        }


    }
}
