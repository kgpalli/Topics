package geeksforgeeks;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailIDExtraction {

    public static void extractEmailIds(BufferedReader br, PrintWriter pw, Pattern p) throws IOException {
        String line = br.readLine();
        while(line != null){
            Matcher m =p.matcher(line);

            // If any match
            while(m.find())
            {
                // write the email id
                // to output.txt file
                pw.println(m.group());
            }
            // Goto next line in input.txt file
            line = br.readLine();

        }
        pw.flush();

    }

    public static void main(String[] args)throws IOException{


        // PrintWriter for writing email id to output.txt file
        PrintWriter pw = new PrintWriter("output.txt");

        // Compile() argument is the
        // regular expression for email id
        Pattern p =Pattern.compile("[a-zA-Z0-9]"
                +"[a-zA-Z0-9_.]"
                +"*@[a-zA-Z0-9]"
                +"+([.][a-zA-Z]+)+");

        // BufferedReader for reading
        // from input.txt file

        BufferedReader br = new BufferedReader(
                new FileReader("/Users/kgollapa/IdeaProjects/PersonalProject/Topics/src/test/java/geeksforgeeks/input.txt"));


       // Calling extractEmailIds
                extractEmailIds(br, pw, p);


    }




}
