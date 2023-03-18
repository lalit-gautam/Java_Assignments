package Assignment_20_15_03_2023;

import java.util.Arrays;
import java.util.Scanner;

public class FindTheSumOfSecondLargestAndSmallest {

    public static void main(String[] args) {
        int[] arr = {1,5,4,3,2,9,8,7,6};
//        int[] arr2 = {1};
//        int[] arr;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Size of array : ");
//        arr = new int[sc.nextInt()];
//        System.out.println("Enter Elements into array : ");
//        for(int i=0;i<arr.length;i++){
//            arr[i] = sc.nextInt();
//        }
        System.out.println("Sum of second largest and second smallest number sum in an array is : "+sumOfSecondSmallestAndLargest(arr));
//        sumOfSecSmallAndLarge(arr);
    }

//    public static void sumOfSecSmallAndLarge(int[] arr){
//        int l1 = arr[0] , l2 = 0;
//        int s1 = arr[0] , s2 = Integer.MAX_VALUE;
//
//        for(int i=1 ; i<arr.length ;i++){
//
//            if(arr[i] > l1){
//                l2 = l1;
//                l1 = arr[i];
//            }
//            if(l1 > arr[i] && l2 < arr[i]){
//                l2 = arr[i];
//            }
//            if(arr[i] < s1){
//                s2 = s1 ;
//                s1 = arr[i];
//            }
//            if(s1 < arr[i] && s2 > arr[i]){
//                s2 = arr[i];
//            }
//        }
//        System.out.println(s1 +"  "+ l2);
//        System.out.println(s2 +"  "+ l2);
//        System.out.println(s2+l2);
//    }

    public static int sumOfSecondSmallestAndLargest(int[] arr){
        if(arr.length<=1){
            return -1;
        }
        for(int i=0 ; i<arr.length-1 ; i++){
            for(int j=i+1 ; j<arr.length ; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int small = arr[0];
        int max = arr[arr.length-1];
        int sum = 0;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] != small){
                sum += arr[i];
                break;
            }
        }

        for(int i=arr.length-1 ; i>=0 ; i--){
            if(arr[i] != max){
                sum += arr[i];
                break;
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
        return sum;
    }
}
