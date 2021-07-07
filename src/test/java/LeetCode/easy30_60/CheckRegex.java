package LeetCode.easy30_60;

import java.util.Arrays;

public class CheckRegex {


    public static void main(String[]args){
        String str = "app_aexp.com";
        String regex="\\s*[._]+";
        String[]parts = str.split("\\s*[._]+");

        System.out.println(Arrays.toString(parts));
    }


}
