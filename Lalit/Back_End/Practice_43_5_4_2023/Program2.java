package Practice_43_5_4_2023;

import java.util.Arrays;
import java.util.Random;

public class Program2 {
    public static void main(String[] args) {

        //  Write a Java program to shuffle a given array of integers
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        System.out.println("Original Array: "+ Arrays.toString(arr));
        shuffle(arr);
        System.out.println("Shuffle Array: "+Arrays.toString(arr));
    }

    public static void shuffle(int [] arr)
    {
        for (int i = arr.length - 1; i >= 1; i--)
        {
            Random rand = new Random();

            int j = rand.nextInt(i + 1);

            swap_elements(arr, i, j);
        }
    }
    private static void swap_elements(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
