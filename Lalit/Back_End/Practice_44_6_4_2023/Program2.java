package Practice_44_6_4_2023;

import java.util.Arrays;

public class Program2 {
    public static void main(String[] args) {

        // Write a Java program to replace each element of the array with product of every other element in a given array of integers.
        int[] arr = { 1, 2, 3, 4, 5, 6, 7};
        System.out.println("Original array: "+Arrays.toString(arr));
        int[] result = findProductInArray(arr);
        System.out.println("Array with product of every other element: " + Arrays.toString(result));
    }

    public static int[] findProductInArray(int[] arr)
    {
        int n = arr.length;

        int[] left_element = new int[n];
        int[] right_element = new int[n];

        left_element[0] = 1;
        for (int i = 1; i < n; i++) {
            left_element[i] = arr[i - 1] * left_element[i - 1];
        }

        right_element[n - 1] = 1;
        for (int j = n - 2; j >= 0; j--) {
            right_element[j] = arr[j + 1] * right_element[j + 1];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = left_element[i] * right_element[i];
        }
        return arr;
    }
}
