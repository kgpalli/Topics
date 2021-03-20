package LeetCode.easy30_60;

import LeetCode.BST.Node;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Input =  {1,4,5} Output = 11
 *Input =  {3,2,1,2,6} Output = 17
 * */

public class MinumWaitingTime {

    public static int minimumWaitingTime(int[]queries){
        int waiting_time=0;
        int total_time=0;
        Arrays.sort(queries);
        Queue<Node> queue = new LinkedList<>();

        while(queries.length>0 || !queue.isEmpty()){

        }
       return waiting_time;
    }



    public static void main(String[]args){
        int[] queries = {1,4,5};

        System.out.println(minimumWaitingTime(queries));
    }
}
