package com.ps.service;

import java.util.Objects;
import java.util.Scanner;

public class DailyStatus {
	static int money = 100;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Are You Awake enter Y for yes ");
		if (!getResult()) {
			System.out.println("Sleeping ! ");
		} else {
			System.out.println("Are You Going To office Today ?");
			if (!getResult()) {
				System.out.println("Go To Sleep");
			} else {
				System.out.println("Are You Prepared ?");
				if (!getResult()) {
					System.out.println("Preparing For Office...");
				}
				System.out.println("Are You Hungry ? ");
				if (getResult()) {
					System.out.println("Where Do you wanna eat ?(Home / Hotel)");
					if (sc.next().toLowerCase().equals("hotel")) {
						haveEnoughMoney(20);
					}
					System.out.println("Eating Done");
				}
				System.out.println("How are You planning to go ?(public / Private)");
				if (sc.next().toLowerCase().equals("public")) {
					haveEnoughMoney(30);
				} else {
					System.out.println("Does Your vehicle have enough Fuel ? (Y/n)");
					if (!getResult()) {
						haveEnoughMoney(100);
					}
				}
				System.out.println("Reached at office   wallet balance: " + money);
			}
		}
	}

	public static boolean getResult() {
		Scanner sc = new Scanner(System.in);
		if (sc.next().equalsIgnoreCase("y")) {
			return true;
		}
		return false;
	}

	public static void haveEnoughMoney(int requiredMoney) {
		if (requiredMoney > money) {
			money += requiredMoney;
			System.out.println("Added Some Money To Account ");
		}
		money = money - requiredMoney;
		System.out.println("Deducted money");
	}
}