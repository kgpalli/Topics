package forloop2;

public class ReverseInteger {

    // do modulus operation of the number to extract the last digit, initiate result with 0 , for each iteration multiply result with
    // 10 and append with the remainder
    public static void main(String[] args) {

        int i= 12345;
        int reverse=0;
        while(i>0)
        {
          int temp = i%10;
           reverse = reverse*10+temp;
           i=i/10;
        }

       System.out.println("Reverse of 12345 is " + reverse);


    }
}
