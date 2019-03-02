package codingbat.warmup2;

public class Stringx {

    public static void main(String[] args) {


        String str = "xxHxix";
        String result = "";
//        String sub = "";
//
//        for(int i=1;i<str.length()-1;i++)
//        {
//            if(str.charAt(i) != 'x')
//
//                result += str.charAt(i);
//
//            }
//        sub = str.substring(0,1)+result+str.substring(str.length()-1);
//        System.out.println(sub);
        int len = str.length();

        for (int i = 0; i < len; i++) {

            char temp = str.charAt(i);

            if (!(i > 0 && i < len - 1 && temp == 'x'))

                result = result + temp;


        }
        System.out.println(result);


    }

}