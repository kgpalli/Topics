package LeetCode.easy30_60;

public class BinaryAlternatingBits {

    public static boolean hasAlternatingBits(int n) {

        String binary_number = Integer.toBinaryString(n);
        for (int i = 0; i < binary_number.length() - 1; i++) {
            if (binary_number.charAt(i) == binary_number.charAt(i+1)) {
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
