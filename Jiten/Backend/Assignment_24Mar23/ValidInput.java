package Assignment_24Mar23;

import java.util.Scanner;

public class ValidInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input no between 1 to 10");
		
		boolean ckeck = false;
		do {
			int input = sc.nextInt();
			if(input <= 10 && input >= 1) {
				
				System.out.println("Input value : "+input);
			}
			else {
				System.out.println("Please try again...");
				ckeck = true;
			}
		}
		while(ckeck);
	}
}
