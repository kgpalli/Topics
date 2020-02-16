package geeksforgeeks;

import java.util.Arrays;
import java.util.List;

public class StringSplit {

    public static void main(String[] args) {

        String str = "https://e1bluecloud.aexp.com/v4/console/project/%s/overview";

        List<String> urlVersion = Arrays.asList(str.split("/",7));

        for(String s : urlVersion)
        {
            if(!s.contains("v4")){
                s = "v3";
            }
            System.out.println(s);
        }

        System.out.println(urlVersion);
     //   String s = urlVersion[3];

        /*for(int i=0;i<str1.length;i++){
             s= str1[3];
             if(!s.contains("v4")){
                 s = "v3";
             }

        }*/
       /* if(!s.contains("v4")){
            s = "v3";
        }

        System.out.println(s);*/



    }

}
