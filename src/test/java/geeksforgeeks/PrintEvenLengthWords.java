package geeksforgeeks;

public class PrintEvenLengthWords {

    public static void main(String[] args) {

        String str = " I am learning java";

        String []arr = str.split(" ");

        for(String a : arr){
            if(a.length()%2==0)
            {
                System.out.println(a);
            }
        }

    }
}
