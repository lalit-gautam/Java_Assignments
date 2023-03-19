package Fibonacci;

import java.util.ArrayList;

public class FibonacciWithMemoization {
    public static void main(String[] args) {
        int n = 8;
        Integer[] fibSeries = new Integer[n];
        for(int i=0;i<fibSeries.length;i++){
            fibSeries[i] = -1;
        }
        System.out.println("Fib at  7th index  : "+fib(n , fibSeries) );
    }

    public static int fib(int n , Integer[] arr){
        if(n<=1){
            return n;
        }
        else{
            if(arr[n]!=-1){
                return arr[n];
            }
            arr[n] = fib(n-1 , arr) + fib(n-2 , arr);
            return arr[n];
        }
    }

}
