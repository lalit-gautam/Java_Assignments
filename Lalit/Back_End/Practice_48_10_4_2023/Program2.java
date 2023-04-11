package Practice_48_10_4_2023;

import java.util.Arrays;

public class Program2 {
    public static void main(String[] args) {


        // Write a Java program to remove the duplicate elements of a given array and return the new length of the array.
        int [] arr = {20, 20, 30, 40, 50, 50};
        System.out.println("Length of the array : " + arr.length);

        System.out.println("New length of the array after removing duplicates : ");
        System.out.println(sort(arr));
    }

    public static int sort(int [] arr){
        int index = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[index -1]){
                arr[index++] = arr[i];
            }
        }
        return index;
    }

}
