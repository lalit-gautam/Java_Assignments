package Assignment_05Mar23;

import java.util.Scanner;

public class NumbersOccuranceInArray {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter array size : ");
		int arraySize = sc.nextInt();
		int number [] = new int[arraySize];
		System.out.println("Enter the elements to array : ");
		for(int arrayInput = 0; arrayInput < number.length ; arrayInput++) {
			number[arrayInput] = sc.nextInt();
		}
		
		for(int arrayIndex = 0; arrayIndex < number.length; arrayIndex++) { //This loop for taking every elements from an array. 
			int count = 0;
			System.out.println(number[arrayIndex]+" : "+count);
			for(int j = arrayIndex+1; j < number.length; j++ ) { // 'j' has taken for checking the element with ever element of the array.
				if(number[arrayIndex] == number[j])
					count++;
			}
		}
		sc.close();
	}
}
