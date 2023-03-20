package Assignment_09Mar23;

import java.util.Scanner;

public class Pascal_Triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the row : ");
		int row = sc.nextInt();
	
		for(int i = 0; i < row; i++) {
			for(int space = row; space > i; space--) {   //Print the spaces.
				System.out.print(" ");
			}
			int numberPrint = 1;
			for(int j = 0; j <= i; j++) {
				System.out.print(numberPrint +" ");
				numberPrint = numberPrint * (i - j)/(j + 1); //Printing for middle number.This is the formula to print the statement.
			}
			System.out.println();
		}
		sc.close();
	}
}
