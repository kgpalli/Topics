package LeetCode.easy30_60;
/**
 * Input: n = 22
 * Output: 2
 * Explanation: 22 in binary is "10110".
 * The first adjacent pair of 1's is "10110" with a distance of 2.
 * The second adjacent pair of 1's is "10110" with a distance of 1.
 * The answer is the largest of these two distances, which is 2.
 * Note that "10110" is not a valid pair since there is a 1 separating the two 1's underlined.
 *
 * */

public class BinaryGap {
    public static int binaryGap(int n) {
     int binary_gap=0;

     String binary_num = Integer.toBinaryString(n);
     for(int i=0;i<binary_num.length();i++){
         int  distance=0;

         for(int j=i+1;j<binary_num.length();j++){
             if(binary_num.charAt(i)=='1' && binary_num.charAt(j) == '1'){
                 distance = j-i;
               break;
             } }
         if(distance>binary_gap){
             binary_gap= distance;
         }
     }

      return binary_gap;
    }


    public static void main(String[]args){
   int n=8;
   System.out.println(binaryGap(n));




    }
}
