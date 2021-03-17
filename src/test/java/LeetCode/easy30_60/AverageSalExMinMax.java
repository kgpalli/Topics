package LeetCode.easy30_60;

import java.util.Arrays;

/**
 * 	Given an array of unique integers salary where salary[i] is the salary of the employee i.
 * 	Return the average salary of employees excluding the minimum and maximum salary.
 * 	Example 1:
 * 	Input: salary = [4000,3000,1000,2000]
 * Output: 2500.00000
 * Explanation: Minimum salary and maximum salary are 1000 and 4000 respectively.
 * Average salary excluding minimum and maximum salary is (2000+3000)/2= 2500
 *
 *
 * */

public class AverageSalExMinMax {

    public static double average(int[] salary) {

       double sum=0;
       int max = salary[0];
       int min = salary[0];

       for(int i=0;i<salary.length;i++){
           max = Math.max(max,salary[i]);
           min = Math.min(min, salary[i]);

           sum += salary[i];
       }

       return (sum -max - min) / (salary.length-2);

    }



    public static void main (String[]args){
        int[]salary = {8000,9000,2000,3000,6000,1000};
        System.out.println(average(salary));

    }

}
