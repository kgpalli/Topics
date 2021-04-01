package LeetCode.easyGT60;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CountItemMatch {

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
     int count=0;
        if(ruleKey.equals("type")){
            for (List<String> item : items) {
                if (item.get(0).equals(ruleValue))
                    count++;
            }
        }
        if(ruleKey.equals("color")){
            for (List<String> item : items) {
                if (item.get(1).equals(ruleValue))
                    count++;
            }
        }
        if(ruleKey.equals("name")){
            for (List<String> item : items) {
                if (item.get(2).equals(ruleValue))
                    count++;
            }
        }

        return count;
    }


    public static void main(String[]args){

        List<String>list1 = new ArrayList<>();
        list1.add("phone");
        list1.add("blue");
        list1.add("pixel");

        List<String>list2 = new ArrayList<>();
        list2.add("computer");
        list2.add("silver");
        list2.add("lenova");

        List<String>list3 = new ArrayList<>();
        list3.add("phone");
        list3.add("gold");
        list3.add("iphone");

        List<List<String>> items = new ArrayList<>();
        items.add(list1);
        items.add(list2);
        items.add(list3);

        String ruleKey = "color";
        String ruleValue = "silver";

        System.out.println(countMatches(items,ruleKey,ruleValue));

    }

}
