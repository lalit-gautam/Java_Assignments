//Java Program to Check Whether a Number can be Expressed as Sum of Two Prime Numbers
package com.ps.assignment;

public class Assignment02 {
	// Function to check prime number
	static boolean isPrime(int num) {
		boolean isPrime = true;
		for (int i = 2; i <= num / 2; ++i) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}

		return isPrime;
	}

	public static void main(String[] args) {

		int number = 34;
		boolean flag = false;
		for (int i = 2; i <= number / 2; ++i) {

			// condition for i to be a prime number
			if (isPrime(i)) {

				// condition for n-i to be a prime number
				if (isPrime(number - i)) {

					// n = primeNumber1 + primeNumber2
					System.out.println(number+" = "+i+" + "+(number-i));
					flag = true;
				}

			}
		}

		if (!flag)
			System.out.println(number + " cannot be expressed as the sum of two prime numbers.");
	}

}
