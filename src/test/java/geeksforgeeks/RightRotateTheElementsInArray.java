package geeksforgeeks;

/*
* Original array:
1 2 3 4 5
* Array after right rotation: out put
3 4 5 1 2
* */

public class RightRotateTheElementsInArray {

    public static void rotateBy(int[]arr,int k){

        int len = arr.length;
        k=k%len;

        reverse(0,len-k-1,arr);
        reverse(len-k,len-1,arr);
        reverse(0,len-1,arr);

    }

    private static void reverse(int start, int end, int[]arr){


        while (start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

    }

    public static void main(String[]args){

        //Initialize array

       int[]arr1 = new int[] {1,2,3,4,5};
        //n determine the number of times an array should be rotated.
       int n = 3;

        //Displays original array
        System.out.println("Original array: ");
        for(int i=0;i<arr1.length;i++){
           System.out.print(arr1[i] + " ");
       }
        //Rotate the given array by n times toward right
        for(int i=0;i<n;i++){
            int j, last;
            last = arr1[arr1.length-1];



            //Stores the last element of array

            for( j=arr1.length-1;j>0;j--){

                //Shift element of array by one
                // 1 iteration = 5,1,2,3,4 2 nd iteration = 4,5,1,2,3, 3rd iteration = 3,4,5,1,2
                arr1[j] = arr1[j-1]; // replace 5 with 4 , 4 with 3, 3 with 2

            }

            arr1[0] = last;
        }

        System.out.println();

        //Displays resulting array after rotation
        System.out.println("Array after right rotation: ");

        for(int i = 0; i< arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }


        //  method 2






    }
}
