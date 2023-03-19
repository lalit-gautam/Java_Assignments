package Assignment_09Mar23;

import java.util.Scanner;

public class Pattern_G_Print {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row : ");
		int row = sc.nextInt();
		if(row % 2 == 0) {
			row++;
			System.out.println("Row value increased to "+(row));
		}
		int mid = row / 2 + 1;
		//System.out.println(mid);
			
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= row; j++) {
				if(j == 1 && i > 1 && i < row || j == row && i >= mid && i < row|| i == 1 && j > 1 && j < row || i == row && j >1 && j < row || i == mid && j >= mid)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		sc.close();
	}
 }
