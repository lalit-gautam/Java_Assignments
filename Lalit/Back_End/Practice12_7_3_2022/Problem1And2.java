package Practice12_7_3_2022;

import java.util.Arrays;

public class Problem1And2 {
    public static void main(String[] args) {

        int [] arr = {9, 34, 7, 67, 3};
        findHighestNumber(arr);
        int [] arr1 = {78, 2, 67, 2, 98};
        findHighestNumber(arr1);

        int [] arr2 = {78, 8, 3, 49};
        reverseArray(arr2);
//        System.out.println(Arrays.toString(arr2));

    }

    static void reverseArray(int [] arr) {

        System.out.println("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Array in reverse order: ");

        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void findHighestNumber(int [] arr){

        int l = arr.length;
        int maxElement = arr[0];
        for(int i = 1; i < l; i++){
            if(maxElement < arr[i]){
                maxElement = arr[i];
            }
        }
        System.out.println(maxElement);
    }
}
