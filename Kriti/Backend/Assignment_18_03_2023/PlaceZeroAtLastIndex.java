package Assignment_18_03_2023;

import java.util.Arrays;

public class PlaceZeroAtLastIndex {
    public static void main(String[] args) {
        int[] arr = {5, 4, 5, 6, 0, 0, 0, 0, 0, 1, 2, 3};
        sortArrayWithLastZero(arr);
        System.out.println(Arrays.toString(arr));
    }

    //place all zeros in last index
    public static void sortArrayWithLastZero(int[] arr) {
        int count = 0;
        for(int i=0;i<arr.length-1;i++){

            for(int j = i+1;j< arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            if(i==0){
                count++;
            }
        }
        rotateAntiCyclic(arr , count-1);
    }
    public static void rotateAntiCyclic(int[] arr , int n){
        for(int j=0;j<n;j++){
            int temp = arr[0];
            for(int i=0;i<arr.length-1;i++){
                arr[i] = arr[i+1];
            }
            arr[arr.length-1] = temp;
        }
    }

}
