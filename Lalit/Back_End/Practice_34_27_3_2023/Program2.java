package Practice_34_27_3_2023;

import java.util.Arrays;

public class Program2 {
    public static void main(String[] args) {

        // program to remove duplicate elements of a given array and return
        // the new length of the array.
        int [] nums = {20, 20, 30, 40, 50, 50, 50};
        System.out.println(nums.length);
        removeDuplicates(nums);

    }

    public static void removeDuplicates(int [] arr){

        System.out.println("Original Array : " + Arrays.toString(arr));

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");

        }
        System.out.println("The new length of the array is : " + arraySort(arr));
    }

    public static int arraySort(int [] arr){
        int index = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[index - 1]){
                arr[index++] = arr[i];
            }
        }
        return index;
    }
}
