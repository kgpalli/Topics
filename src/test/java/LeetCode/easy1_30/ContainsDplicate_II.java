package LeetCode.easy1_30;

public class ContainsDplicate_II {


    public static boolean containsNearbyDuplicate(int[] nums, int k) {


        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                int count = 0;
                if(nums[i] == nums[j]){
                    count = j-i;
                    if(count<=k){
                        return true;
                    }
                }
            }
        }

        return false;

    }

    public static void main(String[]args) {

        int[] nums = {1, 2, 3, 1};
        int k = 3;

        System.out.println(containsNearbyDuplicate(nums,k));
    }
}
