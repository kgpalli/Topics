package LeetCode.easy30_60;

public class BinaryAlternatingBits {

    public static boolean hasAlternatingBits(int n) {

        String s = Integer.toBinaryString(n);
        char[] ch = s.toCharArray();

        System.out.println("Binary number is : " + s);

        if(s.length()==1)
            return true;
       if(ch[0] == ch[1]){
           return false;
       }
        for(int i=0;i<ch.length-2;i++){
            if(ch[i] == ch[i+1]){
                return false;
            }
            if(ch[i] != ch[i+2]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[]args){
        int num = 1;

    System.out.println(hasAlternatingBits(num));
    }
}
