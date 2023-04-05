package Practice_39_1_4_2023;

import java.util.Arrays;

public class Program1 {
    public static void main(String[] args) {

        // program to remove the duplicate element from the given array and return the new length of the array
        int [] arr = {20, 20, 30, 40, 50, 50, 50};
        removeDuplicates(arr);
    }

    public static void removeDuplicates(int [] arr){

        int [] newArr = new int[arr.length];
        int x = 0;

        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] != arr[i + 1]){
                newArr[x++] = arr[i];
            }
        }
        newArr[x++] = arr[arr.length - 1];
        System.out.println("Length of the array : " + x);

        System.out.println(Arrays.toString(newArr));

    }
}
