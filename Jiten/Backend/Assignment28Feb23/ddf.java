package Assignment28Feb23;

import java.util.Scanner;

//Write a program to check whether the triangle is equilateral, isosceles or scalene triangle.

public class TypeOfTriangle {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a first line of triangle.");
		double firstLine = scan.nextDouble();
		System.out.println("Enter a second line of triangle.");
		double secondLine = scan.nextDouble();
		System.out.println("Enter a third line of triangle.");
		double thirdLine = scan.nextDouble();
		scan.close();
		if( firstLine == secondLine && firstLine == thirdLine )
			System.out.println("Equilateral Triangle");
		else if(firstLine == secondLine || secondLine == thirdLine || firstLine == thirdLine)
			System.out.println("Isosceles Triangle");
		else
			System.out.println("Scalene Triangle");
	}
}
