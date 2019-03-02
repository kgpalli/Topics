package miscillaneous;

public class FindIntegers {
    public static void main(String[] args) {

        int[] a = {7, 9, 23, 5, 3};

        boolean status = false;

        for(int i=0;i<a.length;i++)
        {
            if(a[i]==23)
            {
                status = true;
            }
        }

System.out.println(status);
    }
}