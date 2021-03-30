package LeetCode.easyGT60;

/*
*For a given number N in base-10, return the complement of it's binary representation as a base-10 integer.
* Input: 5   Output: 2
Explanation: 5 is "101" in binary, with complement "010" in binary, which is 2 in base-10
* Input: 7   Output: 0
* Input: 10   Output: 5
* */

public class BitwiseComplement {

    public static int bitwiseComplement(int N) {
      if(N==0){ return 1;}
        String s = Integer.toBinaryString(N);
        StringBuilder sb = new StringBuilder();
         for(int i=0;i<s.length();i++){
             if(s.charAt(i)=='1'){
               sb.append('0');
             } else{
                 sb.append('1');
             }
         }

         int m = Integer.parseInt(sb.toString(),2);
         return m;

    }


    public static void main(String[]args){
        int n = 10;

        System.out.println(bitwiseComplement(n));

    }

}
