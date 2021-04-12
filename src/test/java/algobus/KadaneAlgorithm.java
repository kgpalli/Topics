package algobus;

/**
 * Kadane's Algorithm
 *  Topic: Dynamic Programming; Difficulty: Intermediate
 *  Write a function that takes in a non-empty array of integers and returns the maxmium sum that can be obtained by summing up all of the integers in a non-empty subarray of the input array. A subarray must only contain 'adjacent numbers'.
 *  (numbers next to each other in the input array).
 * */

public class KadaneAlgorithm {

public static int kadaneAlgorithm(int[]arr){
    int max_sum=arr[0];
    int accumulative_sum=arr[0];

    for(int i=1;i<arr.length;i++){
        int current_element = arr[i];
        accumulative_sum = Math.max(current_element,accumulative_sum + current_element);
        max_sum = Math.max(accumulative_sum,max_sum);

    }

    return max_sum;
}


    public static void main(String[]args){

        int[]arr = {3,5,-9,1,3,-2,3,4,7,2,-9,6,3,1,-5,4};

        System.out.println(kadaneAlgorithm(arr));




    }
}
