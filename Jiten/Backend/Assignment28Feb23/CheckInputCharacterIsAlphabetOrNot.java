package Assignment28Feb23;

import java.util.Scanner;

//Write a program to check whether a character is alphabet or not

public class CheckInputCharacterIsAlphabetOrNot {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a alphabet");
		char inputCharacter = scan.next().charAt(0);
		scan.close();
		if((inputCharacter >= 'a' && inputCharacter <= 'z')|| (inputCharacter >= 'A' && inputCharacter <= 'Z'))
			System.out.println("Entered character is a alphabet.");
		else
			System.out.println("Entered character isn't a alphabet.");
	}
}
