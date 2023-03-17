package Practice22_15_3_2023;

import java.util.Arrays;

public class Program1 {
    public static void main(String[] args) {

        // Java program to copy all the elements of one array to another array.
        int [] arr = {34, 6, 78, 45, 2};
        copyArray(arr);
    }

    public static void copyArray(int [] arr){

        int [] newArr = new int[arr.length];
        newArr = arr;

        for(int i = 0; i < arr.length; i++){
            newArr[i] = arr[i];
        }

        System.out.println("Array : " + Arrays.toString(arr));
        System.out.println( "New Array : " + Arrays.toString(newArr));
    }
}
