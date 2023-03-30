package Practice_35_28_3_2023;

import java.util.Arrays;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {


        // java program to find the cumulative sum of an array
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int size = scanner.nextInt();

        int [] numbers = new int[size];

        System.out.println("Enter array elements : ");
        for(int i = 0; i < size; i++){
            numbers[i] = scanner.nextInt();
        }

        int [] sum = cumulativeSum(numbers);

        System.out.println("Cumulative sum : " + Arrays.toString(sum));
    }

    public static int [] cumulativeSum(int [] numbers){

        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum = sum + numbers[i];
            numbers[i] = sum;
        }
        return numbers;
    }
}
