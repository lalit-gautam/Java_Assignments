package Practice19_26_2_2023;

import java.util.Arrays;

public class Program1 {
    public static void main(String [] args){

        // program to find the second largest element in the array.
        int [] arr = {45, 6, 78, 45, 34, 99, 65, 1, 9};
        findSecondLargestNumber(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void findSecondLargestNumber(int [] arr){

        int length = arr.length;
        int temp ;

        for(int i = 0; i < length; i++){
            for(int j = i + 1; j < length; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int second_highest_number = arr[arr.length - 2];
        System.out.println("Second Highest Number : " + second_highest_number);
    }
}
