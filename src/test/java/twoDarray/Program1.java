package twoDarray;

public class Program1 {
    public static void main(String[] args) {

        int [][] a =  {
                {2},
                {4,7,6},
                {9,5}
        };


        System.out.println("Length of row 1 is " + a[0].length);
        System.out.println("Length of row 2 is " + a[1].length);
        System.out.println("Length of row 3 is " + a[2].length);

// 2d array Using Loop

        int [][] b = {
                {-2},
                {-4, -7, -6,7},
                {9, -5}
        };

        for(int i=0;i<b.length;++i)
        {
          for(int j=0;j<a[i].length;j++)
          {
              System.out.println(a[i][j]);
          }
        }


        // It's better to use for..each loop to iterate through arrays whenever possible. You can perform the same task using for..each loop as:


        int [][] c = {
                {-7},
                {-2, -9, -6,7},
                {8, -5}
        };
// k[0]=-7  (iterates 3 times)
for(int[] k:c)
{
for(int data : k)//(data iterates 7 times)
{
    System.out.println(data);
}
}
// 3D array

        int [][][]array3D = {
        {
            {4, 7, 8, 0},
                {2, 3},
                {1}
                },
                {
                        {4, 2},
                        {8},
                        {8, -5}
                }
                };


for(int [][]array :array3D )
{
    for(int[] data2 : array)
    {
        for(int item : data2)
        {
            System.out.println(item);
        }

    }
}


// practice

        int [][]n = {

                {1, 2, 3}
        };

for(int []l : n)
{
    for(int m : l)
    {
        System.out.println(m);
    }
}
    }



}
