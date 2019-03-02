package forloop2;

public class SumOfEvenOdd {
    public static void main(String[] args) {

        int n = 12345;
        char choice;
        int odd = 0;
        int even = 0;

        if(n%2==0)
            {
                even += n;
            }else
            {
                odd += n;
            }




        System.out.println( "Odd total is " + odd);
        System.out.println( "even total is " + even);


    }
}
