package Assignment_16_03_2023;

import java.util.Arrays;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4, 5, 5, 5, 6, 7, 7, 7, 7};
        System.out.println(Arrays.toString(removeDuplicateElements(arr)));
    }

    //    33. Write a Java program to remove the duplicate elements of a given array and return the new length of the array.
    public static int[] removeDuplicateElements(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && arr[i] != -1) {
                    arr[j] = -1;
                    count++;
                }
            }
        }
//        System.out.println(Arrays.toString(arr) + " " + (count));
        int[] ans = new int[arr.length - count];
        int anscount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1) {

                ans[anscount++] = arr[i];
            }

        }
        return ans;
    }
}
