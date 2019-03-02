package codingbat.warmup2;

public class StringMatch {

    public static void main(String[] args) {

        String a = "aaxxaaxx";
        String b = "iaxxai";

//        int counta = 0;
//
//        String suba = "";
//        String subb = "";
//
//        for (int i = 0; i < a.length()-1;i=i+2) {
//            suba = a.substring(i, i + 2);
//
//            for (int j = 0; j < b.length()-1; j++) {
//                subb = b.substring(j, j + 2);
//                if (suba.equals(subb)) {
//                    counta++;
//                    break;
//                }
//
//            }
//
//
//        }
//        System.out.println(counta);

//   Math.min to find minimum length out of both arrays
        int len = Math.min(a.length(), b.length());

        int count = 0;


        for (int i = 0; i < len - 1; i++) {
// using same loop to run both strings
            String aSub = a.substring(i, i + 2);

            String bSub = b.substring(i, i + 2);

            if (aSub.equals(bSub))

                count++;
        }
        System.out.println(count);
    }
}