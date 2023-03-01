package Assignment22Feb23;

import java.util.Scanner;

public class FindBodyMassIndex {
    public static void main(String[] args) {
        // Get the input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your weight in kg: ");
        double weight = input.nextDouble();
        System.out.print("Enter your height in meters: ");
        double height = input.nextDouble();
        input.close();

        // Calculate the BMI
        double bodyMassIndex = weight / (height * height);

        // Print the result
        System.out.println("Your Body Mass Index is " +bodyMassIndex);

        if (bodyMassIndex < 18.5) {
            System.out.println("You are underweight.");
        } else if (bodyMassIndex < 25) {
            System.out.println("You are of normal weight.");
        } else if (bodyMassIndex < 30) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are very fat.");
        }
    }
}