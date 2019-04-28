package nopatterns;

public class Pattern7 {

   /*       7 6 5 4 3 2 1
            6 5 4 3 2 1
            5 4 3 2 1
            4 3 2 1
            3 2 1
            2 1
            1*/


    public static void main(String[] args) {

        int num = 7;

        for (int i = num; i >= 1; i--) { // every iteration i reduces till it reaches 1
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }




    }
}
