package Assignment_20_15_03_2023;

import java.util.Arrays;

public class MaxFromContinousSubarray {
    public static void main(String[] args) {
        int[] arr  = {7,8,9,4 , 1 ,2 ,3, 4, 5,100};
        getSumArray(arr , 4);

    }
    public static void getSumArray(int[] arr , int num){
        int max = -1;
        int count = 0;

        for(int i=0 ; i<= arr.length-num ; i++){
            int sum = 0;
            for(int j=i;j<i+num;j++){
                sum += arr[j];
            }
            System.out.println(sum);
            if(max < sum){
                max =  sum;
                count = i;
            }
        }
        System.out.println("Max Element is : "+max);
//        System.out.println("Index of addition : "+count+" "+(count+1)+" "+(count+2));
        System.out.print("Index Of Maximum : ");
        for(int i=count;i<count+num;i++){
            System.out.print("  "+i);
        }
    }
}
