package LeetCode.easy30_60;

import java.util.Stack;

/**
 * 	Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.
 * 	Note that after backspacing an empty text, the text will continue empty.
 * 	Input: S = "ab#c", T = "ad#c"
 * Output: true
 * Explanation: Both S and T become "ac".
 *
 * */

public class BackSpaceStringCompare {

    public static boolean backspaceCompare(String S, String T) {

        Stack<Character> sStack = new Stack<>();
        for(char c1 : S.toCharArray()){
            if(c1 != '#'){
                sStack.push(c1);
            }else if(!sStack.isEmpty()){
                sStack.pop();
            }
        }

        Stack<Character> tStack = new Stack<>();

        for(char c1 : T.toCharArray()){
            if(c1 != '#'){
                tStack.push(c1);
            }else if(!tStack.isEmpty()){
                tStack.pop();
            }
        }

        System.out.println("char is String S :" + sStack);
        System.out.println("char is String T :"+ tStack);

        while(!sStack.isEmpty()){
            char current = sStack.pop();
            if(tStack.isEmpty() || tStack.pop() != current){
                return false;
            }
        }





           return sStack.isEmpty() && tStack.isEmpty();

    }



    public static void main(String[]args){

     String S = "ab#c";
     String T = "ad#c";

     System.out.println(backspaceCompare(S,T));


    }

}
