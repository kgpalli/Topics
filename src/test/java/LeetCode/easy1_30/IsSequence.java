package LeetCode.easy1_30;

public class IsSequence {

    public static boolean has_sequence(String seq, String word){

        int seq_index=0;
        int  wrd_index=0;

        if(seq.length()==0){
            return true;
        }


        while(wrd_index<word.length()){
            if( word.charAt(wrd_index) == seq.charAt(seq_index)){
                seq_index++;
                if(seq_index==seq.length()) return true;
            }
            wrd_index++;

        }
        return false;

    }


    public static void main (String[]args){
        String seq = "acb";
        String word = "ahbgdc";

        System.out.println(has_sequence(seq,word));
    }
}
