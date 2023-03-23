package Assignment_20Mar23;

import java.util.Scanner;

public class AdditonOfTwoMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of matrix");
		int rows = sc.nextInt();
		int columns = sc.nextInt();
		
		int firstMatrix[][] = new int[rows][columns];
	    int secMatrix[][] = new int[rows][columns];
	    int sum[][] = new int[rows][columns];
	    
	    System.out.println("Enter the Elements of first matrix");
	    for(int rowNumber = 0; rowNumber < rows; rowNumber++) {
	    	for(int columnNumber =0; columnNumber < columns; columnNumber++) {
	    		firstMatrix[rowNumber][columnNumber] = sc.nextInt();
	    	}
	    }
	    
	    System.out.println("Enter the Elements of second matrix");
	    for(int rowNumber = 0; rowNumber < rows; rowNumber++) {
	    	for(int columnNumber =0; columnNumber < columns; columnNumber++) {
	    		secMatrix[rowNumber][columnNumber] = sc.nextInt();
	    	}
	    }

	    for(int rowNumber = 0; rowNumber < rows; rowNumber++) {
	    	for(int columnNumber =0; columnNumber < columns; columnNumber++) {
	    		sum[rowNumber][columnNumber] = firstMatrix[rowNumber][columnNumber] + secMatrix[rowNumber][columnNumber];
	    		
	    	}
	    }
	    
	    System.out.println("Sum of entered matrix : ");
	    for(int rowNumber = 0; rowNumber < rows; rowNumber++) {
	    	for(int columnNumber =0; columnNumber < columns; columnNumber++) {
	    		System.out.print(sum[rowNumber][columnNumber]+ "\t");	    		
	    	}
	    	System.out.println();
	    }

	}
}
