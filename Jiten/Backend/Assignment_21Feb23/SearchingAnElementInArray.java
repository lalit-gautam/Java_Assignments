package Assignment_21Feb23;

import java.util.Scanner;

public class SearchingAnElementInArray {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter array size : ");
		int arraySize = sc.nextInt();
		int number [] = new int[arraySize];
		System.out.println("Enter the elements to array : ");
		for(int arrayInput = 0; arrayInput < number.length ; arrayInput++) {
			number[arrayInput] = sc.nextInt();
		}
		
		System.out.println("Enter key number : ");
		int keyElement = sc.nextInt();
		sc.close();
		
		System.out.println("Index position of key element : ");
		for(int i=0; i < number.length; i++) { //Iterate for searching key value.
			if(number[i] == keyElement)
				System.out.println(i);
		}
	}
}
