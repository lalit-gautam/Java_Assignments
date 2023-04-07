package Practice_44_6_4_2023;

import java.util.Arrays;

public class Program1 {
    public static void main(String[] args) {

        //  Write a Java program to rearrange a given array of unique elements such that every second element of the
        //  array is greater than its left and right elements.
        int[] nums= { 1, 2, 4, 9, 5, 3, 8, 7, 10, 12, 14 };
        System.out.println("Original array:\n"+ Arrays.toString(nums));
        rearrangeArrayNumbers(nums);
        System.out.println(Arrays.toString(nums));
    }
    private static void swapNums(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void rearrangeArrayNumbers(int[] arr)
    {
        for (int i = 1; i < arr.length; i += 2)
        {
            if (arr[i - 1] > arr[i]) {
                swapNums(arr, i - 1, i);
            }

            if (i + 1 < arr.length && arr[i + 1] > arr[i]) {
                swapNums(arr, i + 1, i);
            }
        }
    }
}
