package codingbat.warmup2;

public class NoTriples {

    public static void main(String[]args)
    {
        int [] nums={1, 1, 2, 2, 1};
        boolean status=true;
        for(int i=0;i<nums.length-2;i++)
        {
            // we cannot compare nums[i]==nums[i+1]==nums[i+2]
            if((nums[i]==nums[i+1]) && (nums[i+1]==nums[i+2]))
            {
                status= false;
            }
        }
        System.out.println(status);
    }



}
