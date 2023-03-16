//Find the max sum of 3 continuous subarray from an array with index
package com.assignment;

import java.util.Scanner;

public class Assignment01 {

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
		int result[]=findMaxSumWithIndex(arr);
		System.out.println("The maximum sum is  "+result[3]+"  and the index are "+result[0]+" "+result[1]+" "+result[2]);
	}

	// to find the max sum of 3 continious subarray
	public static int[] findMaxSumWithIndex(int arr[]) {
		int count=0;
		int result[] = new int[4];
		int sum = arr[1] + arr[2] + arr[3];
		for (int i = 0; i < arr.length; i++) {
			int innersum = 0;
			for (int j = i; j < i + 3 && j<arr.length; j++) {
				innersum += arr[j];
			}
			if (innersum > sum)
			{
				sum = innersum;
				count++;
			}
		}
		for(int i=0;i<3;i++)
		{
			result[i]=count++;	
		}
		result[3]=sum;
		return result;
	}

}
