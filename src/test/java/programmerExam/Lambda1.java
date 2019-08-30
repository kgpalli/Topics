package programmerExam;

import java.util.function.Predicate;

public class Lambda1 {

    public static void main(String[] args) {


        Lambda1 m1 = new Lambda1();

        // ======== Legal Lambdas ========

        m1.go(x -> 7 < 5);
        m1.go(x -> {
            return adder(2, 1) > 5;
        });  // block
        m1.go((Lambda1 x) -> {
            int y = 5;
            return adder(y, 7) > 8;
        }); // multi statement block
        m1.go(x -> {
            int y = 5;
            return adder(y, 6) > 8;
        }); // no arg type, block

        int a = 5, b = 6;

        m1.go(x -> {
            return adder(a, b) > 8;
        });
        m1.go((Lambda1 x) -> adder(a, b) > 13);

        /* ======== Illegal Lambdas ========

         m1.go(x -> return adder(2,1)>5;); cannot return value with a void type method
          m1.go(Lambda1 x -> adder(2,3) >7);
           m1.go(() -> adder(2,3) >7); wrong number of parameters expected 1 but found 0 (prdeicate needs one arg)

          m1.go( x ->{adder(4,2 ) >9}); blocks need statement
         m1.go( x ->{int y=5;adder(y,6 ) >8;}); block needs return */


    }

    void go(Predicate<Lambda1> expr) {
        Lambda1 m2 = new Lambda1();
        System.out.println(expr.test(m2) ? "terinary true" : "terinary false");
    }

    static int adder(int x, int y) {
        return x + y;
    }

}
