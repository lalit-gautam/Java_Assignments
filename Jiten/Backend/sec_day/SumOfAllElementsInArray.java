package sec_day;

import java.util.Scanner;

public class SumOfAllElementsInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int sizeOfArray = sc.nextInt();
		int array[] = new int[sizeOfArray];
		int sum = 0;
		
		System.out.println("Enter elements to array : ");
		for (int index = 0; index < array.length; index++) //Array elements from user.
		{
			array[index] = sc.nextInt();
			sum = sum + array[index];
		}
		System.out.println("Sum of all array elements : "+sum);
	}
}
