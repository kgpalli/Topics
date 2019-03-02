package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderBasics {

    // You must need to mention data provider method name in Test method
    @Test(dataProvider="DataContainer")
  public  void methodWithSingleAttribute(String s)
    {
       System.out.println(s);
    }


@DataProvider(name="DataContainer")

    public Object [] myDataProvider()
{
    // Passing 3 set of data and each set contains single value
    Object data[] = new Object[3];

    data[0] = "New";
    data[1] = "Java";
    data[2] = "World";
    return data;
}

}
