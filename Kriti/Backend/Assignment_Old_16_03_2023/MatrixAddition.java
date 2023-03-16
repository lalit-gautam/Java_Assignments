package Assignment_16_03_2023;

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix1 = new int[n][n];
        int[][] matrix2 = new int[n][n];

        System.out.println("Enter 1st Matrix : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter 2nd Matrix : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix2[i][j] = sc.nextInt();

            }
        }
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0 ;j<n;j++){
                System.out.print(matrix1[i][j]+matrix2[i][j]);
            }
            System.out.println();
        }

    }
}
