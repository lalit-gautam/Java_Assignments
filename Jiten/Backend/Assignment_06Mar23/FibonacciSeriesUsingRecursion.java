package Assignment_06Mar23;

import java.util.Scanner;

public class FibonacciSeriesUsingRecursion {
	static int range,count=2;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number of fibonaci series : ");
		int number1 = sc.nextInt();
		System.out.println("Enter second number of fibonaci series : ");
		int number2 = sc.nextInt();
		System.out.println("Enter the range of the series : ");
		range = sc.nextInt();
		sc.close();
		System.out.print(number1+" , "+number2);
		fibonacciseries(number1,number2);
	}
	
	public static int fibonacciseries(int number1,int number2) { //Recursion method.
		if(range > count ) {
			int result = number1 + number2;
			System.out.print(" , "+result);
			number1 = number2;
			number2 = result;
			count++;
			return fibonacciseries(number1,number2);
		}else {
			return -1;
		}
		
	}
}
