package Practice25_18_3_2023;

import java.util.Arrays;

public class Problem1 {
    public static void main(String[] args) {

        // program to find the maximum product of two integers in a given array of integers.
        int [] arr = {4, 6, 3, 4, 8, 3};
        productMax(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void productMax(int [] arr){

        // first we need to sort the array then we need to find the highest and second highest element

        for(int i = 0; i < arr.length; i++){
            for(int j = i+ 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Highest element in the array : ");
        System.out.println(arr[arr.length - 1]);
        int x = arr[arr.length - 1];
        System.out.println("Second highest element in the array : ");
        System.out.println(arr[arr.length - 2]);
        int y = arr[arr.length - 2];

        int product = x * y;
        System.out.println("The product is : " + product);



    }
}
