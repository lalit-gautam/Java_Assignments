package Assignment_10Mar23;

import java.util.Scanner;

public class SquarePatternWithNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row : ");
		int row = sc.nextInt();
		sc.close();

		int print=1,midRowPrint = 0;
		for (int i = 1; i <= row; i++) {

			if (i == 1) {
				for (int j = 1; j <= row; j++) {
					System.out.print(print+" ");
					print++;
				}
				midRowPrint = print * 2 -1;  //Because value of print already increased to 5. so I take this statement.
			}
			else if(i == row){
				int lastRowPrint = print;
				for(int j = 1; j <= row ; j++) {
					System.out.print(lastRowPrint+" ");
					lastRowPrint ++;
				}
			}
			else {
				for(int j = 1; j <= row; j++) {
					System.out.print(midRowPrint+" ");
					midRowPrint++;
				}
			}
			System.out.println();
		}
	}
}

