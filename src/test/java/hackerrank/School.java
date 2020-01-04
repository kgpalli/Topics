package hackerrank;

public class School {
    public  String firstName;
    public String lastName;
    public int id;


    public School(String firstName,String lastName,int id  )
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id ;
    }

    public void printPerson()
    {

        System.out.println( " Name : " + firstName + " , " + lastName);
        System.out.println( " ID : " + id);

    }



}
