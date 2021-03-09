package LeetCode.easy30_60;

import java.util.ArrayList;
import java.util.List;

// ["abcd", "bnrt",   "crm",   "dt" ]

public class ValidWordSqure {

    public static boolean validWordSquare(List<String> words) {
        if(words == null || words.size() == 0){
            return true;
        }
        int n = words.size();
        for(int i=0; i < n; i++){

            for(int j=0; j < words.get(i).length(); j++){
                if(j >= n || words.get(j).length() <= i || words.get(j).charAt(i) != words.get(i).charAt(j))
                    return false;
            }
        }
        return true;

    }


    public static void main(String[]args){

        List<String> words =new ArrayList<>();

        words.add("abcd");
        words.add("bnrt");
        words.add("crmy");
        words.add("dtye");

        System.out.println(validWordSquare(words));
    }

}
