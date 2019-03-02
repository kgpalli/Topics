package codingbat.warmup2;

public class Count9 {

    public static void main(String[]args)
    {
        int[]nums = {1, 9, 9, 3, 9};

        int count = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==9) // '9' is wrong
                count++;
        }
        System.out.println(count);
    }


}
