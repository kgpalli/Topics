package miscillaneous;

public class SecondHighest {
    public static void main(String[] args) {

        int [] num = {45,67,54,34,32};
        int largest=0;
        int secondLargest=0;


        for(int i=0;i<num.length;i++)
        {
            if(num[i]>largest)
            {
                secondLargest=largest; // assign value of largest to second largest
                largest=num[i];

                }
                else if(num[i]>secondLargest)

                   secondLargest=num[i];
            }

System.out.println(secondLargest);







    }
}
