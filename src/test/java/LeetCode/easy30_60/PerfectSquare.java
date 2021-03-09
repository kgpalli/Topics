package LeetCode.easy30_60;

public class PerfectSquare {

    public static boolean isPerfectSquare(int num) {


        if(num<2){
            return true;
        }
        long start=2;
        long end = num/2;

        while(start<=end){
            long mid = start + (end-start) / 2;
            System.out.println("Mid is " + mid);

            // I iteration end is 8, mid is 5, II iteration end is 4, mid is 3, III iteration

            if(mid*mid==num){
                return true;
            }else if(mid*mid>num){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }

         return false;
    }



    public static void main(String[]args){

       System.out.println(isPerfectSquare(16));

    }
}
