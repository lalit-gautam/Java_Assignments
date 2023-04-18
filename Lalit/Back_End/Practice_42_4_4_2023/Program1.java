package Practice_42_4_4_2023;

import java.util.Arrays;

public class Program1 {
    public static void main(String[] args) {

        /*

        Write a Java program to sort an array of positive integers of a given array, in the sorted array the
        value of the first element should be maximum, second value should be minimum value, third should be second
        maximum, fourth second be second minimum and so on


         */

        int [] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println(Arrays.toString(arr));

        int [] result = arrayRearrange(arr, arr.length);
        System.out.println(Arrays.toString(result));


    }

    public static int [] arrayRearrange(int [] arr, int size){

        int [] temp = new int[size];
        int small_number = 0;
        int largest_number = size - 1;
        boolean flag = true;

        for(int i = 0; i < size ; i++){
            if(flag)
                temp[i] = arr[largest_number--];
            else
                temp[i] = arr[small_number++];

            flag = !flag;
        }
        return temp;
    }
}
