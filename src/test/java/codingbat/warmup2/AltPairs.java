package codingbat.warmup2;

public class AltPairs {

    public static void main(String[] args) {
        String str = "kitten";
        String result = "";

//        for (int i = 0; i < str.length();i=i+4)
//        {
//            result = result+str.substring(i,i+2);
//
//        }
        for (int i=0; i<str.length(); i += 4) {

            int end = i + 2;

            if (end > str.length()) {

                end = str.length();

            }

            result = result + str.substring(i, end);

        }


        System.out.println(result);
    }
}