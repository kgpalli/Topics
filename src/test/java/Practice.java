import java.util.HashSet;
import java.util.Set;

public class Practice {



    public static void main(String[]args){
    String s = "abcdablsdh".toLowerCase();

        Set<Character> set = new HashSet<>();

        String sub_string="";
        String max_sub = "";
        for(int i=0;i<s.length();i++) {
            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                if (set.contains(ch)) {
                    break;
                }
                sub_string += ch;
                set.add(ch);

            }

            if (sub_string.length() > max_sub.length()) {
                max_sub = sub_string;
            }
            sub_string = "";
            set.clear();

        }


        System.out.println(max_sub);



    }

}
