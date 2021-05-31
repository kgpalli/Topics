package LeetCode.easy30_60;



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
        int totaltime=0;

        Arrays.sort(queries);
/*
        int i=0;
        while(i<queries.length-1){
            waiting_time += queries[i];
            i++;
            totaltime += waiting_time;
        }*/

        int n = queries.length-1;
        int i=0;

        while(i<n){
            int duration = queries[i];
            int queriesLeft = queries.length - (i+1);
            waiting_time += duration * queriesLeft;
            i++;
        }

       return waiting_time;
    }



    public static void main(String[]args){
        int[] queries = {3,2,1,2,6};

        System.out.println(minimumWaitingTime(queries));
    }
}
