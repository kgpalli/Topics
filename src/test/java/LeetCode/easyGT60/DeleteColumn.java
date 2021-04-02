package LeetCode.easyGT60;

public class DeleteColumn {

    public static int minDeletionSize(String[] strs) {
        int min_deletion=0;
        if(strs.length==0 || strs.length==1) return min_deletion ;
        for(int i=0;i<strs[0].length();++i){
            for(int j=0;j<strs.length-1;++j){
                if(strs[j].charAt(i)>strs[j+1].charAt(i)) {
                    min_deletion++;
                    break;
                }
            }
        }
        return min_deletion;
    }


    public static void main(String[]args){
        String[]strs = {"zyx","wvu","tsr"};

        System.out.println(minDeletionSize(strs));



    }
}
