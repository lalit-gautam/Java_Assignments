package JavaProgramUsingRecursion;

import java.util.Scanner;

public class PrintElementsInTheRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean input = false;
		do {
			System.out.println("Enter range : ");
			int range = sc.nextInt();
			if(range >= 0) {
				input = false;
				
				printElement(range);
				
			}else {
				input = true;
				System.err.println("Please enter a positive number.");
			}
		}while(input);
	}
	static void printElement(int num) {
		for(int i = 0; i <= num; i++) {
			System.out.println(i);
		}
	}
}
