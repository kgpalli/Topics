package factorydesign;

import com.phone.Android;
import com.phone.IOS;
import com.phone.OS;
import com.phone.OperatingSystemFactory;

public class FactoryMain {
    public static void main(String[]args){

        OperatingSystemFactory osf = new OperatingSystemFactory();

        OS phone1 = osf.getInstance("closed");
      phone1.spec();

    }
}
