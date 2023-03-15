//Find the sum of second largest and second smallest number in an array
package com.assignment;

import java.util.Scanner;

public class Assignment03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the lenth of the array :");
		int len=sc.nextInt();
		int arr[]=new int[len];
		System.out.println("Enter the "+len+" elements");
		for(int i=0;i<len;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(getSumOfSecLargAndSecSmal(arr));
	}
	//get sum of second largest and second smallest
	public static int getSumOfSecLargAndSecSmal(int arr[])
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp;
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		int max , min ;
		max = arr[0];
		min = arr[arr.length-1];
		int ans ;
		ans = 0 ;
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.println(arr[i]);
//		}
		for(int i =0 ; i < arr.length ; i++)
		{
			if(arr[i] > max)
			{
				ans += arr[i];
				break;
			}
		}
		for(int i =arr.length-1 ; i>0; i--)
		{
			if(arr[i]<min)
			{
				ans += arr[i];
				break;
			}
		}

		return ans;
	}

}
