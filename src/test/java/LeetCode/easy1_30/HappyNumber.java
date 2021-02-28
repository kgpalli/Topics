package LeetCode.easy1_30;

import java.util.HashSet;

public class HappyNumber {


    public static boolean isHappy(int n) {

        HashSet<Integer> seen = new HashSet<>();

        while(n != 1){
            int current = n;
            int sum=0;
            while(current != 0){
                sum += (current % 10) * (current % 10);
                current /= 10;
            }

            if(seen.contains(sum)){
                return false;
            }
            seen.add(sum);
            n=sum;
        }
        return true;

    }

    public static void main(String[]args){
        int num = 3;
        System.out.println(isHappy(num));
    }
}
