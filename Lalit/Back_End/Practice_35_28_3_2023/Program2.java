package Practice_35_28_3_2023;

import java.util.Arrays;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        // program to put even and odd numbers in an array in 2 separate arrays
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of the array ");
        int n = scan.nextInt();

        int [] numbers = new int[n];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; ++i) {
            numbers[i] = scan.nextInt();
        }


        displayOddEven(numbers);
    }


    public static void displayOddEven(int[] numbers) {

        int countEven = 0;
        int countOdd;
        int [] even;
        int [] odd;


        for (int i : numbers) {
            if (i % 2 == 0)
                ++countEven;
        }

        countOdd = numbers.length - countEven;

        even = new int[countEven];
        odd = new int[countOdd];

        int i = 0;
        int j = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                even[i++] = num;
            } else {
                odd[j++] = num;
            }
        }

        System.out.println("Even numbers: "
                + Arrays.toString(even));
        System.out.println("Odd numbers: "
                + Arrays.toString(odd));
    }
}
