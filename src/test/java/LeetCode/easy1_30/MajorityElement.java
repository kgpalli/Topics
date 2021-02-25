package LeetCode.easy1_30;

public class MajorityElement {


    public static int majorityElement(int[] nums) {
        int majority_element=nums.length/2;

        int i=0;
        while(i<nums.length)
        {
            int count=0;
            int j=i;
            while(j<nums.length){
                if(nums[i] == nums[j]){
                    count++;
                }
                j++;
            }

            if(count>majority_element){
                return nums[i];
            }
            i++;
        }


        return -1;

    }


    public static void main(String[]args){

       int[]nums = {3,2,3};

        System.out.println(majorityElement(nums));

    }
}
