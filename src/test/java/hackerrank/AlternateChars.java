package hackerrank;

import java.util.Scanner;

public class AlternateChars {

    /*
     result = "Hce"
     second = "akr"
     print = "Hce akr"
    The java.util.Scanner.next() method finds and returns the next complete  token from this scanner. A complete token is preceded and followed by input that matches the delimiter pattern. This method may block while waiting for input to scan, even if a previous invocation of hasNext() returned true.

      */


    public static void main(String[] args) {


       /* String str = "Hacker";
        String result = "";
        String second = "";

        for(int i=0;i<str.length();i=i+2)
        {
            result = result+str.charAt(i);

        }
        for(int j=1;j<str.length();j=j+2)
        {
            second = second+str.charAt(j) ;
        }

        System.out.println(result + " " + second);
*/
      Scanner sc  = new Scanner(System.in);

      int i,t,l,j;
      String e="",o="";
      t=sc.nextInt();
      String []s = new String[t];


      for(i=0;i<t;i++)
      {
          s[i]=sc.next();

          l=s[i].length();

          char []c = s[i].toCharArray();

          for(j=0;j<l;j++)
          {
              if(j%2==0)
              {
                  e= e+c[j];
                  }else
              {
                  o=o+c[j];
              }
          }
          System.out.println(e+" "+o);
           e=""; o=""; // it empties the value to take the next input


      }






    }




}
