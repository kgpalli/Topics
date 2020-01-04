package hackerrank;

import java.util.Scanner;
/*
*The Alchemist
Paulo Coelho
248
*
*
*

* */

public class AbstrtactWriter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();
       Reader r = new Reader(title,author,price);
       r.display();


    }

}
