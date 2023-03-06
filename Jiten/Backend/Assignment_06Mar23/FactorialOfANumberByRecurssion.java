package Assignment_06Mar23;

import java.util.Scanner;

public class FactorialOfANumberByRecurssion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int number = sc.nextInt();
		sc.close();
		System.out.println("Factorial of " + number + " is : " + findFactorial(number));

	}

	public static long findFactorial(long number) {
		if(number == 0 || number == 1) {
			return number;
		}else if(number > 1) {
			return number * findFactorial(number - 1);
		}else if(number < -1){
			return number * findFactorial(number + 1);
		}else {
			return -1;
		}
	}
}
