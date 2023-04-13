package Assignment_24Mar23;

import java.util.Scanner;

public class DailyLifeStyleRootin {
	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc =new Scanner(System.in);
		boolean check = false;
		
		do {
			System.out.println("Are you want to doing brush...?");
			String checkYesOrNo = sc.nextLine().toLowerCase().trim();
			if(checkYesOrNo.equals("y") ||checkYesOrNo.equals("yes")) {
				System.out.println("Is toothpaste available or not");
				checkYesOrNo = sc.nextLine().toLowerCase().trim();
				//if()
				
			}
			else if(checkYesOrNo.equals("n")||checkYesOrNo.equals("no")){
				System.out.println("Do brush within 10 mins else, you will be late for office!!! ");
				//Thread.sleep(10000);
				System.out.println("Is toothpaste available...?");
				checkYesOrNo = sc.nextLine().toLowerCase().trim();
				if(checkYesOrNo.equals("n") ||checkYesOrNo.equals("no")) {
					System.out.println("Do brush immediately...Otherwise you will be late for office!!!");
					Thread.sleep(5000);
					System.out.println("After 10 mins...Are you do bath...?");
					checkYesOrNo = sc.nextLine().toLowerCase().trim();
					//if()
				}
				else if(checkYesOrNo.equals("n")||checkYesOrNo.equals("no"))
				System.out.println("Do brush within 10 mins otherwise you will be late for office!!!");
				System.out.println("After 10 mins..., Have you finished brush...?");
				String confirmForBrush = sc.nextLine().toLowerCase().trim();
				if(confirmForBrush.equals("y") ||confirmForBrush.equals("yes")) {
					System.out.println();
				}
			}
			else {
				System.out.println("...Please enter a valid input...");
				check = true;
			}
		}while(check);
		
	}
	static boolean isValidInputOrNot() {
		return false;
	}
	
}
