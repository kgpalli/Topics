package makeSeleniumEasy;

public class FlyodTriangle {

    /*Floyd’s triangle is a right-angled triangular array of natural numbers, used in computer science education.It is named after Robert Floyd.
    It is defined by filling the rows of the triangle with consecutive numbers, starting with a 1 in the top left corner:*/
   /* Logic to draw such pattern:
    In JAVA, such patterns are known as pyramid. We can easily draw using matrix.
    First, we think about row count which will be user input. If user enters 5, there will be 5 rows in triangle. For N, there will be N rows in triangle. So we need to have a for loop which will keep track of number of rows. It must start with 1 and iterate till N.
    Now consider number of columns. For first row, there is only column. For second row, there are only two columns. For nth row, there should be only N columns. So we need to use another for loop, which will start from 1 and keep counter till it reaches number of row.
            Since, we need to print natural numbers in a order, we will initialize a variable and increment it after printing once.
            1
2 3
4 5 6
7 8 9 10
11 12 13 14 15 */


   public static void main(String[] args) {

       int n= 5;
       int k=1;

       for(int i=1;i<=n;i++) //ex : when i==3
       {
           for(int j=1;j<=i;j++)// first iteration j==1, second j==2, third j===3
           {
               System.out.print(k+++" "); // first prints 3+1 = 4, 3+2 = 5, 3+3 = 6
           }
           System.out.println();
       }







    }
}
