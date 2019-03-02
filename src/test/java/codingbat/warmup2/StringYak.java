package codingbat.warmup2;

public class StringYak {

    public static void main(String[] args) {

        String str = "pakyak";
//        String result = "";
//        for (int i=0;i<str.length();i++)
//        {
//            if(str.contains("yak"))
//            {
//                result = str.replace("yak","");
//            }
//        }
//        System.out.println(result);


// OR
        //1.String indexOf() : This method returns the index within this string of the first occurrence of the specified character or -1, if the character does not occur.
        // posyak=3;
        int posYak = str.indexOf("yak");
        while (posYak != -1) {
            //str = 2+0+
           str = str.substring(0, posYak) + str.substring(posYak,3) ;
           posYak = str.indexOf("yak");
        }

       System.out.println(str);
    }
}
