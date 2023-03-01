package sec_day;

import java.util.Scanner;

public class LargestAndSmallestElementInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int sizeOfArray = sc.nextInt();
		int array[] = new int[sizeOfArray];
		
		System.out.println("Enter elements to array : ");
		for (int index = 0; index < array.length; index++) //Take array elements from user.
		{
			array[index] = sc.nextInt();
		}

		for (int firstIndex = 0; firstIndex < array.length; firstIndex++) {
			for (int secondIndex = firstIndex+1 ; secondIndex < array.length; secondIndex++) {
				if(array[firstIndex] < array[secondIndex]) {
					int temp = array[firstIndex];
					array[firstIndex] = array[secondIndex];
					array[secondIndex] = temp;
				}
			}
		}
		
		System.out.println("Largest number in array : "+array[0]);
		System.out.println("Smallest number in array : "+array[array.length-1]);
		sc.close();
	}
}
