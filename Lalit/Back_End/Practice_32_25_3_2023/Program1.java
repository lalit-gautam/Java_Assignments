package Practice_32_25_3_2023;

import java.util.Arrays;

public class Program1 {
    public static void main(String[] args) {

        // program to insert element into the array at the specified position.
        int [] arr = {3, 2, 44, 5};
        insertElementAtIndex(arr, 2, 100);
    }

    public static void insertElementAtIndex(int [] arr, int index, int value){

        int length = arr.length;
        System.out.println("Original Array : " + Arrays.toString(arr));

        for(int i = length - 1; i > index; i--){
            arr[i] = arr[i - 1];
        }
        arr[index] = value;
        System.out.println("New Array : " + Arrays.toString(arr));
    }
}
