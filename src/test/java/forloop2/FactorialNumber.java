package forloop2;

public class FactorialNumber {

    // Factorial number is the product of all positive  integer less than n
    public static void main(String[] args) {

        int n=5;

        // sum should be initiated with 1 to hold value
        int sum = 1;

        for(int i=1;i<=n;i++)
        {
            sum =sum*i ;
        }


        System.out.println(sum);
    }
}
