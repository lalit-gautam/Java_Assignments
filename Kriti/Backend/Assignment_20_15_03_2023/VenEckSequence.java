package Assignment_20_15_03_2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class VenEckSequence {
    public static void main(String[] args) {
        int c;
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        veneckSeq(c);

    }
    public static void veneckSeq(int n){
        int[] arr = new int[n+1];
        arr[0] = 0;
        for(int i=0 ; i<n ; i++){
            int c =0;
            for(int j= i-1 ;  ; j--){
                if(j<0){
                    arr[i+1] = 0;
                    break;
                }
                c++;
                if(arr[j] == arr[i]){
                    arr[i+1] = c;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
