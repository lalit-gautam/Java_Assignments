package Asignment_19_14_03_2023;

import java.util.Arrays;

public class SeparateEvenOdd {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0,11,10};
        System.out.println(Arrays.toString(separateEvenOdd(arr)));

    }
    public  static  int[] separateEvenOdd(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int[] ans = new int[end+1];
        for(int i=0;i< arr.length;i++){
            if(arr[i] % 2==0){
                ans[start] = arr[i];
                start++;
            }else{
                ans[end] = arr[i];
                end--;
            }
        }
        return ans;

    }
}
