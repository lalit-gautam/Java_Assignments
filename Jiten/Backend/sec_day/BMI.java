package sec_day;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        // Get the input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your weight in kilograms: ");
        double weight = input.nextDouble();
        System.out.print("Enter your height in meters: ");
        double height = input.nextDouble();

        // Calculate the BMI
        double bmi = weight / (height * height);

        // Print the result
        System.out.printf("Your Body Mass Index (BMI) is %.2f\n", bmi);

        // Print interpretation of the BMI
        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi < 25) {
            System.out.println("You are of normal weight.");
        } else if (bmi < 30) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }
    }
}