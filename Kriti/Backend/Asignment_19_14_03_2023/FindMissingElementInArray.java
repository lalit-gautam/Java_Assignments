package Asignment_19_14_03_2023;

import java.util.Arrays;

public class FindMissingElementInArray {
    public static void main(String[] args) {
        int[] arr = {5,7,8,9,10,2,3,4};
        findMissing(arr);
    }
    public static void findMissing(int[] arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int c=0;
        for(int i=arr[0];i<arr[arr.length-1];i++){
            if(arr[c++] != i){
                System.out.println("Missing Element : "+i);
                break;
            }
        }
    }
}
