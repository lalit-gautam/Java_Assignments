package _4thday;

import java.util.Scanner;

/* Take an integer 'n' and print the Fibonacci series.
Ex:- (Fibonacci series- 0 1 1 2 3 5 8 13 21....)*/

public class FibanacciSeries {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter how many times process will be run");
		int range = scan.nextInt();
		int number1 = 0, number2 = 1, number3;
		System.out.print(number1+"  "+number2);
		for(int iteration = 2; iteration < range; iteration++) {
			number3 = number1 + number2;
			System.out.print("  "+number3);
			number1 = number2;
			number2 = number3;
		}
		scan.close();
	}
}
