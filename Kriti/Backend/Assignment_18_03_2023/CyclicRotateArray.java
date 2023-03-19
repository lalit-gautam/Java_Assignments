package Assignment_18_03_2023;

import java.util.Arrays;

public class CyclicRotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        rotateArray(arr  ,2);
        System.out.println(Arrays.toString(arr));

    }

    //Write a Java program to cyclically rotate a given array clockwise by one.
    public static  void rotateArray(int[] arr , int n){
        for(int j=0;j<n;j++){
            int temp = arr[arr.length-1];
            for(int i=arr.length-1 ; i>0 ; i--){
                arr[i] = arr[i-1];
            }
            arr[0] = temp;
        }
    }
}
