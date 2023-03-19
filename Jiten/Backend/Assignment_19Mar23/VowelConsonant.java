package Assignment_19Mar23;

import java.util.Scanner;

public class VowelConsonant {

 static void Vowel_Or_Consonant(char y)
 {
     if (y == 'a' || y == 'e' || y == 'i' || y == 'o'
         || y == 'u' || y == 'A' || y == 'E' || y == 'I'
         || y == 'O' || y == 'U')
         System.out.println("It is a Vowel.");
     else
         System.out.println("It is a Consonant.");
 }

 // The Driver code
  public static void main(String[] args)
 {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a alphabet");
     char character = sc.next().charAt(0);
     sc.close();
     Vowel_Or_Consonant(character);
 }
}
