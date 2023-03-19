package Practice21_13_3_2023;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {

        // program to convert temperature from fahrenheit to Celsius degree
//        celsius();

        // program that reads number and displays the square, cube and fourth power of the number
        power();
    }

    public static void celsius(){

        float fahrenheit;
        float celsius;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit : ");
        fahrenheit = sc.nextFloat();

        celsius  = ((fahrenheit-32)*5)/9;
        System.out.println("Temperature in celsius is: "+celsius);
    }

    public static void power(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to print its square , cube and fourth power  ");
        int num = in.nextInt();

        System.out.println("Square: " +  (int) Math.pow(num, 2));
        System.out.println("Cube: " +  (int) Math.pow(num, 3));
        System.out.println("Fourth power: " + (int) Math.pow(num, 4));
    }
}
