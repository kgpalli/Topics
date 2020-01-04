package forloop2;

public class MaxNumber {

    public static void main(String[] args) {

        int[]arr = {1,5,2,4,6,3};
        int max=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }

     System.out.println(max);





    }





}
