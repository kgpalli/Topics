package codingbat.warmup2.array1;

public class Sum2 {
    public static void main(String[]args)
    {
        int[]arr1 = {6,2,3,4};
        int[]arr2 = {4};
        int sum = 0;

        if(arr1.length >=2)
        {
            sum = arr1[0]+arr1[1];
        }
        System.out.println(sum);
        if(arr2.length==1)
        {
            System.out.println(arr2[0]);
        }
    }
}
