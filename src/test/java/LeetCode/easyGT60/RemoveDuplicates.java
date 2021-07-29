package LeetCode.easyGT60;

public class RemoveDuplicates {
    public static String removeDuplicates(String s) {
   char[]stack= new char[s.length()];
   int j=0;
    for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
      if(j>0 && stack[j-1]==ch){
          j--;
      }else{
          stack[j]=ch;
          j+=1;
      }
    }

  return new String(stack,0,j);
    }
    public static void main(String[]args){
        String str = "abbaca";

        System.out.println(removeDuplicates(str));

    }
}
