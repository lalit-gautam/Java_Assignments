package Assignment_18Mar23;

import java.util.Scanner;

public class Pattern_A_Print {
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
				if(j == 1 && i > 1 || i == mid && j <= mid  || i == 1 && j > 1 && j < mid || j == mid && i > 1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		sc.close();
	}
}
