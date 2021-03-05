package LeetCode.easy1_30;
// Output : 3

public class ShortestWordDistance {

    public static int shortDistance(String[]words, String s1, String s2){

        int index1=0, index2=0, min=Integer.MAX_VALUE;


        for(int i=0;i<words.length;i++){
            if(words[i].equals(s1)){
                index1 = i+1;
            }else if(words[i].equals(s2)){
                index2=i+1;
            }
            if(index1>0 && index2>0)
            min = Math.min(min, Math.abs(index1-index2));
        }
        return min;

    }


    public static void main(String[]args){

        String[]words = {"Practice","makes","perfect","coding","makes"};
        String s1 = "coding";
        String s2 = "Practice";

        System.out.println(shortDistance(words,s1,s2));


    }


}
