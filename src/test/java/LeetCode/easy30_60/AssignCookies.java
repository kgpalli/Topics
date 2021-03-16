package LeetCode.easy30_60;

import java.util.Arrays;

/**
 * Assume you are an awesome parent and want to give your children some cookies.
 * But, you should give each child at most one cookie.
 * Input: g = [1,2,3], s = [1,1]
 * Output: 1
 * Input: g = [1,2], s = [1,2,3]
 * Output: 2
 * Explanation: You have 2 children and 3 cookies. The greed factors of 2 children are 1, 2.
 * You have 3 cookies and their sizes are big enough to gratify all of the children,
 * You need to output 2.
 * */

public class AssignCookies {

    public static int findContentChildren(int[] g, int[] s) {

        int contentChildren=0;

        Arrays.sort(g);
        Arrays.sort(s);

        int i=g.length-1;
        int j=s.length-1;

        while(i>=0 && j>=0){
            if(s[j]>= g[i]){
                contentChildren++;
                j--;
                i--;
            }else {
                i--;
            }
        }



        return contentChildren;
    }




    public static void main(String[]args){

        int[]g = {1,2};
        int[]s = {1,2,3};

        System.out.println(findContentChildren(g,s));

    }
}
