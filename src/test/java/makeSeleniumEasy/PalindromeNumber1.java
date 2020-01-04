package makeSeleniumEasy;

public class PalindromeNumber1 {
    public static void main(String[] args) {

       int  num = 2442; // make sure the num value is passed to temp , so that temp can be used to extract the digit
       int rev = 0;
       int temp = num;// temp has the value of num

        if(num<0)
        {
            System.out.println("Number is a zero");
            System.exit(1);
        }else if(num>=0 && num<=9)
        {
            System.out.println("num is a palindrome as it's single digit");
            System.exit(1);
        }
        while(temp>0) // Iterates untill temp become 0
        {
            int rem = temp%10;
            rev = rev*10+rem;
            temp = temp/10;
        }

        System.out.println("rev num is " +rev);
        System.out.println(" num is " +num);

    if(num == rev)
    {
        System.out.println("num is a palindrome" );
    }else
    {
        System.out.println("num is not a palindrome " );
    }






    }
}
