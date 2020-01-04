package hackerRank2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RejexDuplicateWords {

    public static void main(String[] args) {

     String  regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
        Pattern p = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        Scanner in = new Scanner(System.in);


        int numSentences = Integer.parseInt(in.nextLine());

       while(numSentences-- >0){
           String input = in.nextLine();
           Matcher m = p.matcher(input);
           // Check for subsequences of input that match the compiled pattern
           while(m.find()){
               input = input.replaceAll(m.group(),m.group(1));
           }
           System.out.println(input);
       }


       /* Set<String> set = new HashSet<>();
        for(String word : words){
            set.add(word);
            }

        System.out.println(set);*/





    }

    }
