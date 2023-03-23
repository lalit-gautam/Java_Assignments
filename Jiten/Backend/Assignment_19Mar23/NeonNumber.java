package Assignment_19Mar23;

import java.util.Scanner;

public class NeonNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = sc.nextInt();
		
//		if(checkNeonNumber(9))
//			System.out.println("Neon number");
//		else
//			System.out.println("Not neon number");
		int square = number * number;
		int temp = square , sumOfSquareDigits = 0,rem;
		while(temp > 0) {
			rem = temp % 10;
			sumOfSquareDigits = sumOfSquareDigits + rem;
			temp = temp / 10;
		}
		System.out.println(sumOfSquareDigits);
		{
		if(number == sumOfSquareDigits)
			System.out.println("Neon");
		else
			System.out.println("Not neon");
				
		
		}
	}
	
}
