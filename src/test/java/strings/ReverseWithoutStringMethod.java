package strings;

public class ReverseWithoutStringMethod {
    public static void main(String[] args) {


        String str = "LearnJava";
        String result="";

        StringBuilder sb = new StringBuilder(str);

        sb = sb.reverse();

        System.out.println(sb);


        //OR

        for(int i=str.length()-1;i>=0;i--)
        {
            result += str.charAt(i);
        }

        System.out.println("result is " + result);
    }
}
