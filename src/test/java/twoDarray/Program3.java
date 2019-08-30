package twoDarray;

public class Program3 {
    public static void main(String[] args) {

        int [] []scores =new int[3][];

        scores[0][0]=3;
        scores[0][1]=4;
        scores[0][2]=5;

        scores[1][0]=6;
        scores[1][1]=7;


        scores[2][0]=8;
        scores[1][1]=0;


// {{3,4,5},{6,7},{8,0}};
     //   scores = new int[3][];

        for(int [] firstArray :scores)
        {
            System.out.println("firstArray value are " + firstArray);

            for(int secondArray :firstArray )
            {
                System.out.println("secondArray value are " + secondArray);
            }
        }









    }
}
