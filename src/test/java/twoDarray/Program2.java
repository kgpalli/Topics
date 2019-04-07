package twoDarray;

import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {




        /*int [][] arr = new int[20][20];

       int row, col, i,j;


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Row for Array (max 10) :");//rows the number 10 fit
        row = sc.nextInt();

        System.out.print("Enter Number of Col for Array (max 10) :");// columns the number 10 fit
        col = sc.nextInt();

        System.out.print(" Enter " +(row*col)+ "Array Elements : "); // 3*3 = 9
       for(i=0;i<row;i++) // it is to initiate next int
       {
           for(j=0;j<col;j++)
           {
               arr [i][j] = sc.nextInt();
           }
       }

        System.out.print("The Array is :\n");



        for(i=0; i<row; i++) // prints the real value
        {
            for(j=0; j<col; j++)
            {
                System.out.print(arr[i][j]+ "  ");
            }
            System.out.println();
        }*/

// Model 2

        int [][] values = new int[4][5];

        values[0][0]=1;
        values[1][1]=2;
        values[3][2]=3;

        for(int k=0;k<values.length;k++)// it return row length which is 4
        {
            int []sub = values[k];

            for(int l=0;l<sub.length;l++) // it returns column length
            {
                System.out.print(sub[l]+" ");
            }
            System.out.println();
        }


// Model 3

        int [][] value = {{1,2},{3,4}}; // value [0][1] 0=1,2 ; 1=3,4

        System.out.println(value[0][0]);// 0
        System.out.println(value[1][1]); // 1
        System.out.println(value[0][1]); // 2
        System.out.println(value[1][1]); // 3

        // Jagged Array

        String [][] str = new String[2][];

        str[0] = new String[2];

        str[0][0] = "cat";
        str[0][1] = "dog";


        str[1] = new String[3];

        str[1][0] = "fish";
        str[1][1] = "lizard";
        str[1][2] = "bird";


        for(String[] ele:str)
        {
            for(String element : ele){
            System.out.print(element);
            System.out.print(" ");}
            System.out.println();
        }

//    3D ARRAY

        byte[][][] space = new byte[3][3][3];

        space[0][0][0] = 10;
        space[1][1][1] = 20;
        space[2][2][2] = 30;

        System.out.println(space[0][0][0] );
        System.out.println(space[1][1][1] );
        System.out.println(space[2][2][2] );




    }
}
