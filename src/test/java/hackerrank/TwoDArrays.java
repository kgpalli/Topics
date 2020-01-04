package hackerrank;

import java.util.Scanner;

/* --- Input
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0

Result 19,  it looks for biggest hour glass shape
0 0 2   0 2 4   2 4 4   4 4 0
  0       0       2       0
0 0 1   0 1 2   1 2 4   2 4 0


 * */



public class TwoDArrays {

    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        /*int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        scanner.close();

        int max=-63;
        int sum=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                sum=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                if(sum>max){
                    max=sum;
                }
                sum=0;

            }

        }
        System.out.println(max);*/


//   2 nd method

        int[][] values = new int[6][6];

        int max = Integer.MIN_VALUE;
        int temp;

        //populate values Array
        for (int i = 0; i < 6; i++) {   // it will iterated through row

            for(int k=0;k<6;k++)     // it will iterated through column
            {
                values[i][k] =scanner.nextInt();
            }

        }

        // [k=1][k=2][k=3] // i=1
        //       [k=2]     // i=2
        //[k=1][k=2][k=3]  // i=3
        // i=rows i=columns

        for(int i=0;i<4;i++)
        {
            for(int k=0;k<4;k++)
            {
                temp=values[i][k] + values[i][k+1] + values[i][k+2]   // row 1   it checks if k, k+1,K=2 has some value in first row
                + values[i+1][k+1] // row 2 it checks if k+1 has some value in row 2

                        + values[i+2][k] +values[i+2][k+1] + values[i+2][k+2];  // row 3 it checks if k, k+1,K=2 has some value

                max = Math.max(temp,max);
            }
        }
      System.out.println(max);

    }
}