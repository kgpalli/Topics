package LeetCode.easy30_60;

public class ArrangingCoins {

    public static int arrangeCoins(int n) {

        if(n<=0){
            return 0;
        }
        int count =1;
        while(n>0){
            n = n-count;
            if(n<0){
                break;
            }
            count++;
        }
        return count-1;

    }

    public static void main(String[]args){

System.out.println(arrangeCoins(8));

    }
}
