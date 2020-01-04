package conditions;

public class SwitchModel {
    public static void main(String[] args) {
        int operation = 2; // it supposed to execute case 2, if there is no break, it continues till case 4 and prints 20 instead 6
        int number = 10;

        switch(operation)
        {
            case 1:
            {
                number = number+10;
                break;
            }case 2:
        {
            number = number-4;


        }case 3:
        {
            number = number/3;

        }case 4:
        {
            number = number*10;
            break;
        }
        }

        System.out.println(number);

    }
}
