package com.ps.daily;

import java.util.Scanner;

public class DailyRoutine {
	public static double balance = 1;
	public static String common = "Are you ";
	static Scanner scanner = new Scanner(System.in);
	public static boolean bathroomWork = false;
	public static boolean brusingWork = false;
	public static boolean eatingWork = false;
	public static boolean bathroomCheck = false;
	public static void main(String[] args) throws InterruptedException {
		// check the awake
		if (awakeCheck()) {
			// Check bathroom availibility
			if (bathroomCheck()) {
				freshActivity();
				System.out.println("Going to brush:::");
				if (checkToothPaste()) {
					System.out.println("Brushing the teeth........");
					sleepThread();
				} else {
					brusingActivity();
				}
			} else {
				System.out.println("Going to brush:::");
				sleepThread();
				// Checking the the toothpaste
				if (checkToothPaste()) {
					System.out.println("Brushing the teeth........");
					sleepThread();
				} else {
					brusingActivity();
				}
				if(!bathroomWork)
				{
					while(!bathroomCheck)
					{
						System.out.println("Waiting for the bathroom.......");
						sleepThread();
						if(bathroomCheck());
						{
							bathroomCheck=true;
						}
					}
					freshActivity();
				}
			}
			if (getFoodAvaibility()) {
				System.out.println("Going eating.......");
				sleepThread();
				System.out.println("Eating is completed......");
				eatingWork = true;
			} else {
				outSideEatingPreparation();
			}
			System.out.println("Ready for dressng.........");
			sleepThread();
			System.out.println("Dressing is completed....");
			System.out.println("Ready for Office....");
			sleepThread();
			if (!eatingWork) {
				System.out.println("Going to eat dahibara....");
				sleepThread();
				setBalance(0, 20);
			}
			travellingActivity();
			System.out.println("finally at office and the balance is " + balance);
		} else {
			System.out.println("Sleeping mode..........");
			sleepThread();
		}
	}

	public static boolean awakeCheck() {
		System.out.println(common + "awake y /n :::");
		char bathroomCheck = scanner.next().charAt(0);
		if (bathroomCheck == 'y') {
			return true;
		} else
			return false;
	}

	public static boolean bathroomCheck() {
		System.out.println("Check the bathroom is free y /n :::");
		char bathroomCheck = scanner.next().charAt(0);
		if (bathroomCheck == 'y') {
			return true;
		} else
			return false;
	}

	public static boolean checkToothPaste() {
		System.out.println("Check the toothbrush is available or not y /n :::");
		char toothbrush = scanner.next().charAt(0);
		if (toothbrush == 'y') {
			return true;
		} else
			return false;
	}

	public static double getBalance() {
		return balance;
	}

	public static void setBalance(double addBalance, double substractBalance) {
		balance = balance + addBalance - substractBalance;
	}

	// Going to market for paste and substract 20 rupees for the balance
	public static void pasteMarketing() throws InterruptedException {
		System.out.println("Going to market ");
		sleepThread();
		System.out.println("Buy a paste");
		setBalance(0, 20);
		System.out.println("Coming the hostel ......");
		sleepThread();
		System.out.println("Brushing the teeth........");
		sleepThread();
	}
//checking the food is available or not
	public static boolean getFoodAvaibility() {
		System.out.println("Check the food is available or not y /n :::");
		char toothbrush = scanner.next().charAt(0);
		if (toothbrush == 'y') {
			return true;
		} else
			return false;
	}
//All brusingActivity in morning
	public static void brusingActivity() throws InterruptedException {
		// if balance is not enough then get required amount
		if (getBalance() < 20) {
			double requiredBalance = 20 - getBalance();
			System.out.println(requiredBalance + " is required to buy an toothpaste");
			// Adding the required amount in the balance
			setBalance(20 - getBalance(), 0);
			System.out.println("Adding the the required amount for buy an toothpaste is completed....");
			pasteMarketing();
		} else {
			pasteMarketing();
		}
		brusingWork = true;
	}
//All Freshing activity
	public static void freshActivity() throws InterruptedException {
		System.out.println("Going for freshhhhh....");
		sleepThread();
		System.out.println("Freshing is completed......");
		bathroomWork = true;
	}
//if food is not present then outside eating preparation
	public static void outSideEatingPreparation() throws InterruptedException {
		System.out.println("Food is not available in home...");
		System.out.println("Checking balance for eating in outside..");
		sleepThread();
		System.out.println("The balance is " + getBalance());
		if (getBalance() < 20) {
			double requiredBalance = 20 - getBalance();
			System.out.println(requiredBalance + " is required for eating...");
			// Adding the required amount in the balance
			setBalance(20 - getBalance(), 0);
			System.out.println("Adding the the required amount for eating in outside....");
		}
	}
//checking the petrol availibility
	public static boolean checkPetrol() {
		System.out.println("Petrol is available or not y/n?");
		char checkPetrol = scanner.next().charAt(0);
		if (checkPetrol == 'y') {
			return true;
		} else
			return false;
	}
//
	public static void travellingActivity() throws InterruptedException {
		System.out.println("Do You want to public or private for private press y and any thing for public");
		char modeOfTavel = scanner.next().charAt(0);
		if (modeOfTavel == 'y') {
			if (!checkPetrol()) {
				System.out.println("Petrol is not available so public is mode of travel....");
			} else {
				System.out.println("bike is ready and ready for office...");
			}
		} else {
			System.out.println("Going to office by public.....");
			sleepThread();
		}
		System.out.println("Now in the office....");
	}

	// for add thread for good looking and sleep for 1 sec
	public static void sleepThread() throws InterruptedException {
		for (int i = 0; i <= 5; i++) {
			System.out.print("* ");
			Thread.currentThread().sleep(200);
		}
		System.out.println();
	}

}
