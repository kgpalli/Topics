package LeetCode.easy30_60;

import java.util.ArrayList;
import java.util.List;

//  Input = ["abcd", "bnrt", "crm", "dt" ] Output = "true

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

        words.add("ball");
        words.add("area");
        words.add("read");
        words.add("lady");

        System.out.println(validWordSquare(words));
    }

}
