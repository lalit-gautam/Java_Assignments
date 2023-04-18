package Assignment_24Mar23;

import java.util.Scanner;

public class DailyLife {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		boolean validInput = false;
		String userInput;

		while (!validInput) {
			System.out.println("Are you get up..?");
			userInput = sc.nextLine().toLowerCase().trim();
			if (userInput.equals("y") || userInput.equals("yes")) {
				validInput = true;
				System.out.println("Will you brush..?");
				while (!validInput) {
					userInput = sc.nextLine().toLowerCase().trim();
					if (userInput.equals("y") || userInput.equals("yes")) {
						validInput = true;
					} else if (userInput.equals("n") || userInput.equals("no")) {
						validInput = true;
					} else
						System.out.println("You have entered a wrong keyword. Please enter a valid input...");
				}

			} else if (userInput.equals("n") || userInput.equals("no")) {
				validInput = true;
				System.out.println("Get up early, Otherwise you will be late for office.");
				Thread.sleep(10000);
				System.out.println("...After 5 mins...");
				System.out.println("Will you brush..?");
				while (!validInput) {
					userInput = sc.nextLine().toLowerCase().trim();
					if (userInput.equals("y") || userInput.equals("yes")) {
						validInput = true;
					} else if (userInput.equals("n") || userInput.equals("no")) {
						validInput = true;
					} else
						System.out.println("You have entered a wrong input. Please enter a valid input...");
				}
			} else
				System.out.println("You have entered a wrong input. Please enter a valid input...");
		}
	}
//	static boolean isBrush(String input) {
//		if();
//		
//	}
//	
	/*
	 * 
	 * while(!validInput) { userInput = sc.nextLine().toLowerCase().trim();
	 * if(userInput.equals("y") || userInput.equals("yes")) { validInput = true; }
	 * else if(userInput.equals("n") || userInput.equals("no")) { validInput = true;
	 * } else System.out.
	 * println("You have entered a wrong keyword. Please enter a valid input..."); }
	 * 
	 * 
	 */
}
