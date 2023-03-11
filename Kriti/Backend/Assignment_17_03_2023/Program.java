package Assignment_17_03_2023;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int arr2[][]={{1,2,3},{4,5,6},{7,8,9}};
        matrixMultiplication(arr , arr2);
        isPerfectNumber();
    }

    //Multiplication of matrix
    public static void matrixMultiplication(int[][] arr , int[][] arr2){
        int[][] ans = new int[arr.length][arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                ans[i][j] =0;
                for(int k=0;k<arr.length;k++){
                    ans[i][j]  = ans[i][j] + (arr[i][k] * arr2[k][j]);
                }
                System.out.print(ans[i][j]+"  ");
            }
            System.out.println();
        }
    }


    //perfect number
    public static  void isPerfectNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = sc.nextInt();
        int sum=0;
        if(num <=0 ){
            System.out.println("Not a perfect number ");
            return;
        }
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                sum += i;
            }
        }
        if(sum == num){
            System.out.println("This is  a perfect number");
            return;
        }
        System.out.println("This is not a perfect number");
    }


}
