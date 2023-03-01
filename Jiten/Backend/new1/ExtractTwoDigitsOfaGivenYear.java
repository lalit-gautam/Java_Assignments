package new1;

import java.util.Scanner;

//Java Program to Extract Last Two Digits of a Given Year.

public class ExtractTwoDigitsOfaGivenYear {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a year : ");
		int year = scan.nextInt();
		scan.close();
		int lastTwoDigitsOfYear = year % 100;
		System.out.println("Last two digits of the year = "+lastTwoDigitsOfYear);
	}
}
