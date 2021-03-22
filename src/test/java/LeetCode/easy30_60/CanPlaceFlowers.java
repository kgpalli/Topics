package LeetCode.easy30_60;

/**
 * [0,0,1,0,1]
 * 1
 * Out put = true
 * {1,0,0,0,1} n=1 output = true
 * {1,0,0,0,1} n=2 output = false
 * */

public class CanPlaceFlowers {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
       int len = flowerbed.length;
       int count =0;

       for(int i=0;i<len;i++){
           if(flowerbed[i]==0){
               int prev = i==0 ? 0: flowerbed[i-1];
               int next = i == len-1 ? 0 : flowerbed[i+1];
               if(prev==0 && next==0){
                   flowerbed[i]=1;
                   count++;

               }
           }
       }

        return count>=n;
    }


    public static void main(String[]args){

        int[]arr = {0,0,1,0,1};
        int n = 1;

        System.out.println(canPlaceFlowers(arr,n));

    }
}
