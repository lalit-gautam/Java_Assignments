package Practice29_22_3_2023;

import java.util.Arrays;

public class Program1 {
    public static void main(String[] args) {

        // program to reverse an array
        int [] arr = {23, 56, 8, 67, 54, 20};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int [] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void swap(int [] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
