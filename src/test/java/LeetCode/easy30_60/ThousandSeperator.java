package LeetCode.easy30_60;

public class ThousandSeperator {

    public static String thousandSeparator(int n) {

        if(n<1000){
            return " " + n;
        }
        String s = String.valueOf(n);
        int len = s.length();
        int i = len % 3;


        StringBuilder sb = new StringBuilder();
        sb.append(s.substring(0,i));

        while(i<len){
            if(i>0){
                sb.append('.');
            }
            sb.append(s.substring(i,Math.min(i+3,len)));
            i += 3;
        }

        return sb.toString();
    }

    public static void main(String[]args){

        System.out.println(thousandSeparator(123456789));

    }
}
