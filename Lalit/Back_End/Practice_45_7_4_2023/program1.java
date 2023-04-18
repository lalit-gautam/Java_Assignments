package Practice_45_7_4_2023;

import java.util.Arrays;

public class program1 {
    public static void main(String[] args) {

        // Write a Java program to find and print one continuous subarray (from a given array of integers) that if
        // you only sort the said subarray in ascending order then the entire array will be sorted in ascending order.

        int [] arr = {1, 2, 3, 0, 4, 6};
        System.out.println(Arrays.toString(arr));

        sortedSubArray(arr);
    }

    public static void sortedSubArray(int [] arr){
        int [] result = new int[3];

        int length = arr.length;
        int start = -1;
        int end = -2;
        int min = arr[length - 1];
        int max = arr[0];

        for(int i = 1; i < length; i++){
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[length - 1 - i]);

            if(arr[i] < max){
                end = i;
            }
            if(arr[length - 1 - i] > min){
                start = length - 1 - i;
            }
        }
        result[0] = start;
        result[1] = end;

        System.out.println(Arrays.toString(result));
    }

}
