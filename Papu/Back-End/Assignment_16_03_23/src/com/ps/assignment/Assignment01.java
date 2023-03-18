//To check the number is Emirp or not 13, 199, 107, 113, 1399, 1583, 1201, 3049,
package com.ps.assignment;

import java.util.Scanner;

public class Assignment01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=sc.nextInt();
		if(isEmirp(num))
		{
			System.out.println("The number is emirp");
		}
		else 
		{
			System.out.println("The number is not emirp");
		}

	}
	//To check the number is prime or not
	public static boolean isPrime(int num)
	{
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}
	//To check the number is Emirp or not
	public static boolean isEmirp(int num)
	{
		if(!isPrime(num))
		{
			return false;
		}
		int reverse=0;
		while(num>0)
		{
			int temp;
			reverse=reverse*10+(num%10);
			num=num/10;
		}
		if(isPrime(reverse))
		{
			return true;
		}
		else {
			return false;
		}
		
	}

}
