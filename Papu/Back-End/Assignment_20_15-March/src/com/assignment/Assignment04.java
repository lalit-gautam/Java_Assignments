//revse a number 
package com.assignment;

import java.util.Scanner;

public class Assignment04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int sum = 0, temp = num;
		while (num != 0) {
			if (num > 0) {
				int re = num % 10;
				sum = sum * 10 + re;
				num = num / 10;
			}
			if (num < 0) {
				int re = num % 10;
				sum = sum * 10 - re;
				num = num / 10;
			}
		}
		if (temp < 0)
			System.out.println("The reverse is -" + sum);
		else
			System.out.println("The reverse is " + sum);
	}

}
