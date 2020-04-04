package hackerRank2;


import com.phone.OperatingSystemFactory;
import org.apache.commons.lang3.RandomStringUtils;

import java.io.*;
import java.nio.charset.Charset;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;


 class Practice {



     public static void main(String[] args){

        /* byte[] array = new byte[256];
         new Random().nextBytes(array);
         String randomString = new String(array, Charset.forName("UTF-8"));
         StringBuffer r = new StringBuffer();
         String AlphaNumericString = randomString.replaceAll("[^A-Za-z0-9]", "");

         System.out.println(AlphaNumericString.length() + " lenght is ");

         for (int k = 0; k < AlphaNumericString.length(); k++) {
             r.append(AlphaNumericString.charAt(k));
         }
         System.out.println(r.toString());*/

        int count=10;
        String max_string= RandomStringUtils.randomAlphanumeric(count);

        String s = "test";
        StringBuilder sb = new StringBuilder(s);



        String new_s = s+max_string;
         System.out.println(new_s);



     }
 }



















