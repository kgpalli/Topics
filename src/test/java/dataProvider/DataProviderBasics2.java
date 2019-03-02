package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderBasics2 {
    @Test(dataProvider="DataContainer")
    public  void methodWithSingleAttribute(String firstName,String lastName, String emailID)
    {
        System.out.println(" First Name is : " + firstName + " Last Name Is : " + lastName + "emailId is : " + emailID);
    }


    @DataProvider(name="DataContainer")

    public Object [][] myDataProvider()
    {
        // Passing 3 set of data and each set contains single value
        // new object index starts from '1'
        Object data[][] = new Object[5][3];

        data[0][0] = "Char";
        data[0][1] = "latha";
        data[0][2] = "charu.latha@gmail.com";

        data[1][0]= "Madhu";
        data[1][1]= "Latha";
        data[1][2]= "Madhu.latha@gmail.com";

        data[2][0]= "Chandra";
        data[2][1] = "kala";
        data[2][2] = "Chandra.kala@gmail.com";

        data[3][0] = "Charu";
        data[3][1] = "Sheela";
        data[3][2] = "Charu.sheela@gmail.com";

        data[4][0] = "Madhu";
        data[4][1] = "mathi";
        data[4][2] = "Madhu.mathi@gmail.com";

        return data;
    }
}
