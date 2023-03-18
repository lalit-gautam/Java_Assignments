//To check the number is tech number or not e.g:2025,1213
//explaination 2025=(20)^2+(25)^2=2025
package com.ps.assignment;

import java.util.Scanner;

public class Assignment02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=sc.nextInt();
		if(isTech(num))
		{
			System.out.println("The number is Tech number");
		}
		else 
		{
			System.out.println("The number is not a tech number");
		}

	}
	//to check the number is tech number or not
	public static boolean isTech(int num)
	{
		int digit=0,temp=num;
		while(num>0)
		{
			digit++;
			num=num/10;
		}
		if(digit%2==0)
		{
			int firstContainer=temp%(int)Math.pow(10,digit/2);
			int secondContainer=temp/(int)Math.pow(10,digit/2);
			int sum=(int)Math.pow((firstContainer+secondContainer),2);
			if(temp==sum)
			{
				return true;
			}
			else {
				return false;
			}
		}
		else 
		{
			return false;
		}
	}

}
