package codingbat.warmup2.array1;

public class Get123 {

    public static void main(String[] args) {
        int[] nums = {1, 4, 4, 3};
        int count = 0;

        boolean status = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 2 || nums[i] == 3) {

               count++;
            }

            }if(count==3)
        {
            status=true;
        }
        System.out.println(status);
    }
}
