package hackerrank;

import java.util.Scanner;

public class Person {
    // Class vs Instance4


    private int age;

        public Person(int initialAge) {
            // Add some more code to run some checks on initialAge
            if(initialAge >0)
            {
                this.age = initialAge;
            }
            else
                initialAge = 0;
            System.out.println("Age is not valid, setting age to 0 .");
        }

        public void amIOld() {
            // Write code determining if this person's age is old and print the correct statement:
            if(age < 13)
                System.out.println("You are young.");
            else if(age>=13 && age<18)
            {
                System.out.println("You are a teenager.");
            }else
                System.out.println("You are old.");
        }

        public void yearPasses() {
            age=age+1;
            // Increment this person's age.
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Prnt the number =   ");
            int T =3;
            for (int i = 0; i < T; i++) {
                int age = 12;
                Person p = new Person(age);
                p.amIOld();
                for (int j = 0; j < 3; j++) {
                    p.yearPasses();
                }
                p.amIOld();
                System.out.println();
            }
            sc.close();
        }
    }



