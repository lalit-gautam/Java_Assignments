package Practice_45_7_4_2023;

import java.util.Arrays;

public class Program2 {
    public static void main(String[] args) {
        // Write a Java program to compute the average value of an array of integers except the largest and smallest values.

        int [] arr = {5, 7, 2, 4, 9};
        findAvg(arr);
    }

    public static void findAvg(int [] nums){

        System.out.println("Original Array: "+ Arrays.toString(nums));
        int max = nums[0];
        int min = nums[0];
        float sum = nums[0];
        for(int i = 1; i < nums.length; i++)
        {
            sum  += nums[i];
            if(nums[i] > max)
                max = nums[i];
            else if(nums[i] < min)
                min = nums[i];
        }
        float x = ((sum-max-min) / (nums.length - 2));
        System.out.printf(" the average value of an array of integers except the largest and smallest values: %.2f",x);
    }

}
