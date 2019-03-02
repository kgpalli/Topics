package codingbat.warmup2;

public class Has271 {

    public static void main(String[] args) {
        int[] nums = {4, 5, 3, 8, 0};
        int[] nums1 = {1, 2, 7, 1};
      boolean status = false;

        for (int i = 0; i < nums.length - 1; i++)

        {

            if (i + 2 <= nums.length - 1) {

                int j = Math.abs(nums[i] - 1);

                int k = Math.abs(j - nums[i + 2]);

                if (nums[i + 1] == nums[i] + 5 && k <= 2)


                    System.out.println(nums);
            }
        }

    }
}