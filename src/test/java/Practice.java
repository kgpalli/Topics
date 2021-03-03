


public class Practice {



    public static boolean isHappy(int n) {

       while(n > 0){
           int sum = 0;
           int current = n;

           while(current != 1){
               sum = (current % 10) * (current % 10);
               current /= 10;
           }

           n = sum;
          return true;
       }


       return false;
    }



    public static void main(String[]args){

       System.out.println(isHappy(19));

    }

}
