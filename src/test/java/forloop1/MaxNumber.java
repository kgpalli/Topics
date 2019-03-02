package forloop1;

public class MaxNumber {
    public static void main(String[] args) {
        int number1 = 250;
        int number2 = 330;
        int maxNumber = 0;
        int minNumber=0;
        if(number1>number2)
        {
            maxNumber=number1;
            minNumber=number2;
        }
        else{
            maxNumber=number2;
            minNumber=number1;
        }
        System.out.println(maxNumber+","+minNumber);
    }
}
