package Assignment_17_03_2023;

public class MaximumProductOfInteger {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,8,9,0,100,1};
        System.out.println(findMaxProduct(arr));

    }

    //. Write a Java program to find maximum product of two integers in a given array of integers.
    public static int findMaxProduct(int[] arr){
        int max = 0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]*arr[j] > max){
                    max = arr[i]*arr[j];
                }
            }
        }
        return max;

    }
}
