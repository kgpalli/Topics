package LeetCode.easyGT60;
/**
 * Input: "00110011"
 * Output: 6
 * Explanation: There are 6 substrings that have equal number of consecutive 1's and 0's:
 * "0011", "01", "1100", "10", "0011", and "01".
 *
 * Input: "10101"
 * Output: 4
 * Explanation: There are 4 substrings: "10", "01", "10", "01" that have equal number of consecutive 1's and 0's.
 * */

public class CountBinarySubstrings {

    public static int countBinarySubstrings(String s) {
        int binarysubs = 0;
        int prevBlock = 0;
        int curBlock = 1;
        char current = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            if (current == s.charAt(i)) curBlock++;
            else {
                binarysubs += Math.min(prevBlock, curBlock);
                prevBlock = curBlock;
                curBlock = 1;
            }
            current = s.charAt(i);
        }
        binarysubs += Math.min(prevBlock, curBlock);
        return binarysubs;
    }


    public static void main(String[] args) {
       String s = "00110011";
       System.out.println(countBinarySubstrings(s));

        String str1 = "00110011";

        int k = 2;
        int i = 3;

        printAllSubstrings(str1, i, k);

    }


    private static void printAllSubstrings(String str, int substringLength, int numberOfOnes) {
        // start index of the current window
        int startIndex = 0;

        // count of 1s in current window
        int count = 0;

        // count 1s in the first i characters
        for (int a = 0; a < substringLength; a++) {
            if (str.charAt(a) == '1') {
                count++;
            }
        }

        while (startIndex < str.length() - substringLength + 1) {
            if (count == numberOfOnes) {
                System.out.print(str.substring(startIndex, startIndex + substringLength));
                System.out.print(" ");
            }
            // Test next bit, which will be inside the window next iteration
            if (str.length() > startIndex + substringLength && str.charAt(startIndex + substringLength) == '1') {
                count++;
            }
            // Test the starting bit, which will be outside the window next iteration
            if (str.charAt(startIndex) == '1') {
                count--;
            }
            startIndex++;
        }
    }

}