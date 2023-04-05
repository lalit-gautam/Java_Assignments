package Practice_41_3_4_2023;

import java.util.Arrays;

public class Program2 {
    public static void main(String[] args) {

        // sorting the array using selection sort
        int [] arr = {23, 4, 56, 8, 89, 3};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void selectionSort(int [] arr) {
        for(int i = 0; i < arr.length; i++){
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    public static void swap(int [] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static int getMaxIndex(int [] arr, int start, int last) {
        int max = start;
        for(int i = start; i < last; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}
