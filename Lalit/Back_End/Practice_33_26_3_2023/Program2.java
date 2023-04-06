package Practice_33_26_3_2023;

import java.util.Arrays;

public class Program2 {
    public static void main(String[] args) {
        // program to check if the sum of all the 10s in the array is exactly 30.
        // return false if the condition does not satisfy otherwise true.

        int [] arr = {10, 77, 10, 54, -11, 10};
        System.out.println("Original Array : " + Arrays.toString(arr));

        int searchNumber = 10;
        int fixedNumber = 30;

        System.out.println("Result : " + result(arr, searchNumber, fixedNumber));

    }

    public static boolean result(int [] numbers, int searchNumber, int fixedNumber){
        int temp = 0;
        for(int number : numbers){
            if(number == searchNumber){
                temp = temp + searchNumber;
            }

            if(temp > fixedNumber){
                break;
            }
        }
        return temp == fixedNumber;
    }
}
