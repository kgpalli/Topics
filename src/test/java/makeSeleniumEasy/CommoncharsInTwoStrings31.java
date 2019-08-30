package makeSeleniumEasy;

public class CommoncharsInTwoStrings31 {

// "ABC"; "ABCDEF";
    public static void main(String[] args) {

        String s1 =  "ABC";
        String s2 ="ABCDEF";

        StringBuilder commonChars = new StringBuilder();


        if(s1.length()>0 & s2.length()>0)
        {

            String toBeIterated = (s1.length()>s2.length()?s2:s1);
            String toBeChecked = toBeIterated.equals(s1)?s2:s1;

            System.out.println("toBeIterated is : " + toBeIterated);
            System.out.println("toBeChecked is : " + toBeChecked);

            for(int i=0;i<toBeIterated.length();i++)
            {
                if(toBeChecked.contains(Character.toString(toBeIterated.charAt(i))))
                {
                    commonChars = commonChars.append(Character.toString(toBeIterated.charAt(i)));
                }
            }

            System.out.println("commonChars is : " +commonChars );

        }

        else{
            System.out.println(" "  );
        }











    }

}
