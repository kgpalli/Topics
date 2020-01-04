package hackerrank;

// Day 15

public class ExceptionsPractice {

//  Elements in Array are initialized to " 0 "

    public static void main(String[] args) {

        try {
            int[] i = new int[5];

            System.out.println("element 6 at index 5 =  " + i[4]);

        }catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception thrown " + e);
        }finally {

            System.out.println("Finally clause");
        }

    }
}
