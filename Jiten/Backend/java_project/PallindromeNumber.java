package java_project;

import java.util.Scanner;

public class PallindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int inputNumber = sc.nextInt();
		int temp = inputNumber, reverseNumber = 0;
		while (temp > 0) {
			int remainder = temp % 10;
			reverseNumber = reverseNumber * 10 + remainder;
			temp = temp / 10;
		}
		if (inputNumber == reverseNumber)
			System.out.println("Pallindrome number");
		else
			System.out.println("Not a pallindrome number");
		sc.close();
	}
}
