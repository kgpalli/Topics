package forloop1;

public class printTable {

    public static int  process(int number)
    {
        int result=0;
       for(int i=0;i<=10;i++)
       {
//           result = i*9;
//           System.out.println('9'+"*"+i+"="+result);
           System.out.println(number + " * " + i + " = " + (number * i));
       }
       return result;
    }



    public static void main(String[] args) {
        int number=9;
       int table= printTable.process(number);


    }
}
