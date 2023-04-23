package JavaProgramUsingRecursion;

import java.util.Scanner;

public class  FactorialNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		boolean input = false;
		do {
			System.out.println("Enter range : ");
			int number = sc.nextInt();
			if(number >= 0) {
				input = false;
				
				System.out.println("Factorial of "+number+" is "+fact(number));
			}else {
				input = true;
				System.err.println("Please enter a positive number.");
			}
		}while(input);
	}
	static long fact(int num) {
		if(num == 0 || num == 1) {
			return 1;
		}
		return num * fact(num-1); 
	}
}
