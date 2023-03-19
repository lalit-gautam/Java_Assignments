package Assignment_01Mar23;

import java.util.Scanner;

public class Pattern_1 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter row : ");
		int row = sc.nextInt();
		sc.close();
		
		for(int outer = 0; outer < row; outer++) {
			for(int inner = 0; inner < row-outer; inner++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
