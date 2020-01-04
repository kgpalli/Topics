package makeSeleniumEasy;

/*Input: – mAkE SeleNIUM eaSY
*Output:-MaKe sELEnium EAsy
* */

public class InvertCaseOfString_36 {

    public static void main(String[] args) {

        String str = "mAkE SeleNIUM eaSY";

        char[] ch = str.toCharArray();

       for(int i=0;i<ch.length;i++)
       {
           if(Character.isUpperCase(ch[i]))
           {
               ch[i] = Character.toLowerCase(ch[i]);
           }else
           {
               ch[i] = Character.toUpperCase(ch[i]);
           }
           System.out.print(ch[i]);
       }






    }









}
