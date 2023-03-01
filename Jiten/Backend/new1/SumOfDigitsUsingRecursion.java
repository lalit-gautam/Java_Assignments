package new1;

import java.util.Scanner;

//Java Program to Find Sum of Digits of a Number using Recursion.

public class SumOfDigitsUsingRecursion {
	
	static int sumOfDigitsResult = 0;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = scan.nextInt();
		scan.close();
		int result = sumOfDigits(number);
		System.out.println("Sum of the all digits of "+number+" = "+result);
	}
	public static int sumOfDigits(int number) {
		sumOfDigitsResult = number % 10;
		if(number == 0)
			return 0;
		else
			return sumOfDigitsResult + sumOfDigits(number / 10);
	}
}
