package java_project;

import java.util.Scanner;

public class SumofAllDigitsofaNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int userInput = sc.nextInt();
		int sumOfAllDigits = 0;
		if (userInput > 0) {
			while (userInput > 0) {
				int digits = userInput % 10;
				sumOfAllDigits = sumOfAllDigits + digits;
				userInput = userInput / 10;
			}
		} 
		else {
			while (userInput < 0) {
				int digits = userInput % 10;
				sumOfAllDigits = sumOfAllDigits + digits;
				userInput = userInput / 10;
			}
		}
		if(sumOfAllDigits < 0) {	// for negative number.
			sumOfAllDigits = -1 * sumOfAllDigits;
			System.out.println("Sum of all digits of : " + sumOfAllDigits);
		}
		else
			System.out.println("Sum of all digits of : " + sumOfAllDigits);
		sc.close();
	}
}
