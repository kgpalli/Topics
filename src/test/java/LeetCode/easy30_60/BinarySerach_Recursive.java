package LeetCode.easy30_60;

public class BinarySerach_Recursive {

    public  int recursive_search(int[] nums,int left, int right, int target) {

        if(right>=1){
            int mid =left + (right-left) /2;
            if(nums[mid]==target)  return mid;

             if(nums[mid]>target) return recursive_search(nums,left,mid-1,target);

             return  recursive_search(nums,mid+1,right,target);
        }

        return -1;
    }

    public static void main(String[]args){
        BinarySerach_Recursive bsr= new BinarySerach_Recursive();
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        int n = nums.length;

        int result = bsr.recursive_search(nums,0,n-1, target);

        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);

    }
}
