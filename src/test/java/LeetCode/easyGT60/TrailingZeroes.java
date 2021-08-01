package LeetCode.easyGT60;

public class TrailingZeroes {

    public static int trailingZeroes(int n) {
      int zero_count=0;

      while(n>0){
          n= n/5;
          zero_count += n;
      }

      return zero_count;

    }




    public static void main(String[]args){
        int num = 100;

        System.out.println(trailingZeroes(num));

    }

}
