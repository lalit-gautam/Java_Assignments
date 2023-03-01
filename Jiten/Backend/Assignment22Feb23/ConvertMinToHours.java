package Assignment22Feb23;

import java.util.Scanner;

//7. Write a Java program to convert minutes into a number of hours 
public class ConvertMinToHours {
  public static void main(String[] args) {
	  System.out.println("Enter minuites");
      Scanner scan = new Scanner(System.in);
      int minutes = scan.nextInt();
      scan.close();
      double hours = minutes / 60;
      System.out.println(hours+" hours");
  }
}
