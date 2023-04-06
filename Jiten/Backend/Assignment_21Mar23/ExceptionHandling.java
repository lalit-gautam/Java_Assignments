package Assignment_21Mar23;

import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int result;
		try {
			result = number1 / number2;
			System.out.println("Output = "+result);
		}
		catch(ArithmeticException e){
			System.out.println("ArithmeticException caught: \"Division by zero.\"");
		}
	}
}
