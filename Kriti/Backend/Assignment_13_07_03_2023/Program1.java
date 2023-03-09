package Assignment_13_07_03_2023;

import java.util.Arrays;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       System.out.println("Series Result : "+getResult(n));
        int[] arr = {9,8,7,6,5,3,2,1};
        System.out.println(FindMissingNumber(arr , arr.length)+1);
    }


//    Find THe Missing Number in array

    public static int FindMissingNumber(int[] arr , int n){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i=0;i<n;i++){
            if(arr[i] != i+1){
                return i;
            }
        }
        return  n;
    }

//    Calculate the following series
//    1 - 1/2 + 1/3 - 1/4 + 1/5+...+/- 1/n
    public static double getResult(double n){
        double sum=1;
        boolean isMinus = true;
        for(int i=1;i<=n;i++){
            if(!isMinus){
                sum -= (1f/i);
            }
            else{
                sum+= (1f/i);
            }
            isMinus = !isMinus;
        }
        return sum;
    }


}
