package Assignment_03Mar23;

import java.util.Scanner;

public class Pattern_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row : ");
		int row = sc.nextInt();
		sc.close();

		int revPrint,print=1;
		for (int i = 1; i < row; i++) {

			if (i == 1 || i % 2 == 0) {
				for (int j = 1; j <= i; j++) {
					System.out.print(print+" ");
					print++;
				}
			}else {
				revPrint = print + (i-1);
				for(int j=1; j <= i; j++) {
					System.out.print(revPrint+" ");
					revPrint --;
				}
				print = revPrint + (i+1);
			}
			System.out.println();
		}
	}
}
