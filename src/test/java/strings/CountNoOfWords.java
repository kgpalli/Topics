package strings;

import java.util.HashMap;
// out put = {Saket=2, by=1, this=1, This=1, is=4, done=1}

public class CountNoOfWords {
    public static void main(String[] args) {

        String str = "This this is is done by Saket Saket";
        char[] c = str.toCharArray();
        int count = 0;


        for(int i=0;i<c.length-1;i++)
        {
         if(c[i] != ' ' && c[i+1] == ' ')
         {
             count++;
         }
        }

System.out.println(count+1);

// with hashmap

        HashMap<String , Integer> map = new HashMap<String,Integer>();

         String[]words = str.split("");

         for(String s : words)
         {
             if(map.containsKey(s))
             {
                 int count1 = map.get(s);
                 map.put(s,count1+1);
             }else
             {
                 map.put(s,1);
             }
         }

         // count the word occurance

        HashMap<String , Integer> wordrepeat = new HashMap<String,Integer>();

        String str1 = "This this is is is is done by Saket Saket";

        String [] split1 = str1.split(" ");// "" = char by char split , " " = word by word split
        for(int i=0;i<split1.length;i++)
        {
            if(wordrepeat.containsKey(split1[i]))
            {
              int count1=  wordrepeat.get(split1[i]);
                wordrepeat.put(split1[i],count1+1);
            }else
            {
                wordrepeat.put(split1[i],1);
            }

        }
        System.out.println(wordrepeat);

    }

}
