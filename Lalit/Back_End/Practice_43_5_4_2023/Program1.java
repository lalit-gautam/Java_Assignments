package Practice_43_5_4_2023;

import java.util.Arrays;

public class Program1 {
    public static void main(String[] args) {


        // Given two sorted arrays A and B of size p and q, write a Java program to merge elements of A with B by
        // maintaining the sorted order i.e. fill A with first p smallest elements and fill B with remaining elements.
        int[] arr1 = { 1, 5, 6, 7, 8, 10 };
        int[] arr2 = { 2, 4, 9 };

        mergeSortedArrays(arr1, arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    public static void mergeSortedArrays(int [] arr1, int [] arr2){

        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] > arr2[0]){
                int temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;

                int first_array = arr2[0];
                int j;
                for(j = 1; j < arr2.length && arr2[j] < first_array; j++){
                    arr2[j - 1] = arr2[j];
                }
                arr2[j - 1] = first_array;
            }
        }
    }
}
