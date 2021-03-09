package LeetCode.easy1_30;

public class ExSheetColmnNumber {

    // Input = AA  Output = 27, Input = AB Output = 28

    public static int titleToNumber(String s) {


        int num=0;

        for(char c : s.toCharArray()){
            int i = c - 'A'+1 ;

           num  = num * 26 + i;
        }


        return num;

    }



    public static void main(String[]args){

       String s = "ZY";

       System.out.println(titleToNumber(s));
    }
}
