package codingbat.warmup2;

public class Front9 {
    public static void main(String[] args) {

        boolean status = false;
        int[] nums = {1, 2, 9, 3, 4};
        int len = nums.length;
        // if nums length is < 4 'if' get executed
        if (len <= 4) {
            for (int i = 0; i < len; i++) {

                if (nums[i] == 9)
                    status = true;
                else ;

            }
        } else {  // if nums length is > 4 'else' get executed

            for (int j = 0; j < 4; j++) {
                // checks every iteration if nums = 9
                if (nums[j] == 9)

                    status = true;
            }

        }
        System.out.println(status);
    }
}

