package Practice_42_4_4_2023;

import java.util.Arrays;

public class Program2 {
    public static void main(String[] args) {

        //  Write a Java program to arrange the elements of a given array of integers where all positive integers
        //  appear before all the negative integers.
        int [] arr = {-4, 8, 6, -5, 6, -2, 1, 2, 3, -11};
        arrangeArray(arr);

    }

    public static void arrangeArray(int [] arr){
        int j;
        int temp;
        int size = arr.length;

        for(int i = 0; i < size; i++) {
            j = i;

            while ((j > 0) && (arr[j] > 0) && (arr[j - 1] < 0)) {
                temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }


}
