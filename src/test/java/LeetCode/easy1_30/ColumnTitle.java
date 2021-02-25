package LeetCode.easy1_30;

public class ColumnTitle {

    public static String convertToTitle(int n) {

        StringBuilder sb = new StringBuilder();
        while (n>0){
            n--;
            char toAdd = (char) ((n%26)+65 );
            sb.insert(0,toAdd);
            n /= 26;
        }
        return sb.toString();

    }


    public static void main(String[]args){
        int n = 525;
        System.out.println(convertToTitle(n));

    }



}
