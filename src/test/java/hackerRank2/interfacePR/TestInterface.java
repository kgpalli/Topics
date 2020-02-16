package hackerRank2.interfacePR;

import java.util.Scanner;

//  print result - I implemented : hackerRank2.interfacePR.AdvancedArithmetic    ,   input = 6, out put = 12

public class TestInterface {


    public static void main(String []args){
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented : ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        System.out.print(my_calculator.divisor_sum(n) + "\n");
        sc.close();


    }

    static void ImplementedInterfaceNames(Object o){
      Class [] theInterfaces = o.getClass().getInterfaces();

      for(int i=0;i<theInterfaces.length;i++){
          String interfaceName =theInterfaces[i].getName();
          System.out.println(interfaceName);
      }

    }

}

class MyCalculator implements AdvancedArithmetic {
    int j=0;
    public int divisor_sum(int n) {
        for(int i=1;i<=n;i++){
            if(n%i==0){
                j = j+i;
            }
        }
        return j;
    }
}
interface AdvancedArithmetic{
    int divisor_sum(int n);
}
