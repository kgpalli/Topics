package strings;

public class ReverseStringWithStringReverse {
    public static void main(String[] args) {

        String str = "Learn Advance Java";

        StringBuilder sb = new StringBuilder(str) ;

        sb=sb.reverse();
        System.out.println(sb);

// without reverse converted to char array
        char []c  = str.toCharArray();

        for(int i=c.length-1;i>0;i--)
        {
            System.out.println("Without reverse method : " +c[i]);
        }

        // without converting to char array
        String reverse="";
        String str2 = "Selenium with Maven";
        for(int i=str2.length()-1;i>=0;i--)
        {
            reverse = reverse+str2.charAt(i);
        }
         System.out.println("Using charAt " + reverse);
        }
}
