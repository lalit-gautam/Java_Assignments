package Assignment_1Mar23;

import java.util.Scanner;

public class Pattern_2 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter row : ");
		int row = sc.nextInt();
		sc.close();
		if(row % 2 == 0)
			row++;
		
		for(int outer = 0; outer < row/2+1; outer++) {
			for(int inner = 0; inner <= outer; inner++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = row/2 ; i >= 0; i--) {
			for (int j = 0; j <= i - 1; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}
}
