package LeetCode.easy30_60;

/**
 * A majority element is an element that appears more than N/2 times in an array of length N.
 * 	Int [ ] nums = {2,4,5,5,5,5,5,6,6} target=5;, output = 5;
 *
 * */
public class MajorityElementSortedArray_1150 {
    public static boolean isMajorityElement(int[]nums, int target){
        int count=0;
        int i=0;
        int n = nums.length;
        while(i<n){
            if(nums[i]==target){
                count++;
            }
            i++;
        }
        System.out.println(n/2);
        if(count> n/2) return true;

        return false;
    }


    public static void main(String[]args){

        int[]nums = {2,4,5,5,5,5,5,6,6};
        int target = 101;
        System.out.println(isMajorityElement(nums, target));

    }
}
