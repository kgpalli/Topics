package threadlocal;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadSafeFormatter {
    public static ThreadLocal<SimpleDateFormat>dateFormatter = new ThreadLocal<SimpleDateFormat>() {

        @Override
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd");
        }

        @Override
        public SimpleDateFormat get() {
            return super.get();
        }
    };

}

/*public class UserService{
    public static void main(String[] args) {


    }
    public String birthDate(int userID){
        Date birthDate = birthDateFromDB(userID);
        final SimpleDateFormat df = ThreadSafeFormatter.dateFormatter.get();
        return df.format(birthDate);
    }
}*/
