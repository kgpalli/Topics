package LeetCode;

import java.util.Arrays;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

    n--; m--;

    int index = nums1.length-1;

    while(index>=0){
        if(m<0){
            nums1[index] = nums2[n--];
        }else if(n<0){
            nums1[index] = nums1[m--];
        }else{
            if(nums1[m]>nums2[n]){
                nums1[index] = nums1[m--];
            }else{
                nums1[index] = nums2[n--];
            }
        }
        index--;
    }



        System.out.println(Arrays.toString(nums1));


    }


    public static void main(String [] args){

        int[] nums1 = {1,2,3,0,0,0};
        int [] nums2 = {2,5,6};
        int m=3,n=3;

        merge(nums1,m,nums2,n);

    }
}
