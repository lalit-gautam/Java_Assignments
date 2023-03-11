package Assignment_16_03_2023;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        int[] arr2 = {1,2,3,35,6,7,8,9,0};
//        System.out.println(isArrayEqual(arr  , arr2));

        replaceAtSpecificIndex(arr);
        System.out.println(Arrays.toString(arr));
    }

    //program to replace a character at specific index
    public static  void replaceAtSpecificIndex(int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter index : ");
        int index = sc.nextInt();
        System.out.print("Enter The number to replace : ");
        int newNum = sc.nextInt();
        arr[index] = newNum;

    }

    //check if 2 array are equal or not
    public static boolean isArrayEqual(int[] arr , int[] arr2){
        return Arrays.toString(arr).equals(Arrays.toString(arr2));
    }
}
