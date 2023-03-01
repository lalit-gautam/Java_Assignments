package _4thday;

import java.util.Scanner;

/*A number is called perfect if the sum of its divisor is equal to the number itself.
Ex:- ( 28 = 1+2+4+7+14) */

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range to find perfect numbers between that range : ");
		int range = scan.nextInt();
		
		System.out.println("Perfect numbers are : ");
		for(int number = 1; number <= range; number++) {
			int sumOfAllDivisor = 0;
			for(int divisor = 1; divisor <= number/2; divisor++) {
				if(number % divisor == 0) 
					sumOfAllDivisor +=  divisor;
			}
			if(number == sumOfAllDivisor)
				System.out.println(number);
			scan.close();
		}
	}
}
