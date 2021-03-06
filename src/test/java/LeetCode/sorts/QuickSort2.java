package LeetCode.sorts;

import java.util.Arrays;

public class QuickSort2 {

    public static void main(String[] args) {
        int[] arr = {3, -2, -1, 0, 2, 4, 1};
        int[] arrSorted = {-2, -1, 0, 1, 2, 3, 4};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));


        assert arrayEquals(arr, arrSorted);


    }

    static void quickSort(int[]arr){
        qs(arr,0,arr.length-1);
    }

    static void qs(int[]arr, int left, int right){
        if(left>=right){
            return ;
        }
        int p = partition(arr,left,right);
        qs(arr,left,p-1);
        qs(arr,p+1,right);
    }

    static int partition(int[]arr, int left, int right){
        int pivot = arr[right];
        int i = left-1;
        for(int j=left;j<right;j++) {
            if (arr[j] < pivot) {
                i += 1;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[right];
        arr[right] = temp;
        return i+1;
        // array - {3, -2, -1, 0, 2, 4, 1};
        //I iteration : {-2, -1, 0,3, 2, 4, 1};

    }

    static boolean arrayEquals(int[] a1, int[] a2) {
        if (a1.length != a2.length) {
            return false;
        }
        for(int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
                return false;
            }
        }
        return true;
    }


}
