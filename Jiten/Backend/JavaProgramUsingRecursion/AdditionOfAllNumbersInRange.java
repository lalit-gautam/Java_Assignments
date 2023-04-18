package JavaProgramUsingRecursion;

import java.util.Scanner;

public class  AdditionOfAllNumbersInRange{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		boolean input = false;
		do {
			System.out.println("Enter range : ");
			int number = sc.nextInt();
			if(number > 0) {
				input = false;
				
				System.out.println("Addition of all elements between range "+number+" is "+addition(number));
			}else {
				input = true;
				System.err.println("Please enter a positive range.");
			}
		}while(input);
	}
	static int addition(int num) {
		if(num == 1) {
			return 1;
		}
		return num + addition(num-1); 
	}
}
