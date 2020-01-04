package hackerrank;

import java.util.Scanner;

public class Student extends School {

    private int [] testScores;


    public Student(String firstName, String lastName, int id, int []testScores)
    {
        super(firstName,lastName,id);

        this.testScores = testScores;
    }

    char calculate()
    {
        int sum = 0;
        for(int i=0;i<testScores.length;i++)
        {
            sum = sum+testScores[i];
        }

        int total = sum/testScores.length;

        return (total > 89?'O': total > 79?'E' : total > 69 ? 'A' :total > 54 ? 'P' :total > 39 ? 'D' : 'T');

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String firstName = sc.next();
        String lastName = sc.next();
        int id = sc.nextInt();
        int numScores = sc.nextInt();

        int [] testScores = new int[numScores];

      for(int i=0;i<numScores;i++)
        testScores[i] = sc.nextInt();


        Student s = new Student(firstName,lastName,id,testScores );
        s.printPerson();

      System.out.println(s.calculate());



    }
}
