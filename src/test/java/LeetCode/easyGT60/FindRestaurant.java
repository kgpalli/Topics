package LeetCode.easyGT60;

import java.util.*;

public class FindRestaurant {

    public static String[] findRestaurant(String[] list1, String[] list2) {
         List<String>list = new ArrayList<>();
         HashMap<String,Integer>map1 = new HashMap<>();
        int minIndex=Integer.MAX_VALUE;
        int currentIndex=0;

        for(int i=0;i<list1.length;i++){
           String restaurent1 = list1[i];
           for(int j=0;j<list2.length;j++){
               if(restaurent1.equals(list2[j])){
                   currentIndex = i +j;
                   minIndex = Math.min(minIndex,currentIndex);
                   map1.put(restaurent1,currentIndex);
               }

           }
        }
        for(Map.Entry<String,Integer> entry : map1.entrySet()){

            if(minIndex == entry.getValue()){
                list.add(entry.getKey());
            }
        }

        return list.toArray(new String[list.size()]);

        /**
         *
         * Efficient Way
         *  HashMap < String, Integer > map = new HashMap < String, Integer > ();
         *         for (int i = 0; i < list1.length; i++)
         *             map.put(list1[i], i);
         *         List < String > res = new ArrayList < > ();
         *         int min_sum = Integer.MAX_VALUE, sum;
         *         for (int j = 0; j < list2.length && j <= min_sum; j++) {
         *             if (map.containsKey(list2[j])) {
         *                 sum = j + map.get(list2[j]);
         *                 if (sum < min_sum) {
         *                     res.clear();
         *                     res.add(list2[j]);
         *                     min_sum = sum;
         *                 } else if (sum == min_sum)
         *                     res.add(list2[j]);
         *             }
         *         }
         *         return res.toArray(new String[res.size()]);
         *
         *
         * */
    }

    public static void main(String[]args){

        String [] s1 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] s2 = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};

        System.out.println(Arrays.toString(findRestaurant(s1,s2)));

    }
}
