package Practice4_25_2_2023;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {

        // program to find the number of and sum of all the integers greater than 100 and less than 200 that are divisible by 7
            sumCount7();

        // program to input a number and to check whether it is palindrome or not {a palindrome is a number that remains the same
        // when the number is reversed.
        isPalindrome();
    }
    public static void sumCount7(){
        int sum = 0;
        int count = 0;
        for (int i = 101; i < 200; i++)
        {
            if (i % 7 == 0)
            {
                sum = sum + i;
                count++;
            }
        }
        System.out.println("The Sum of the number between 100 to 200 which are divisible by 7 is: "+sum);
        System.out.println("Total numbers between 100 to 200 which are divisible by 7 is: "+count);
    }

    public static void isPalindrome(){

        int remainder;
        int sum=0;
        int temp;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();

        temp = number;
        while(number > 0){
            remainder = number % 10;
            sum =(sum*10)+remainder;
            number = number/10;
        }
        if(temp == sum)
            System.out.println(temp + " is palindrome");
        else
            System.out.println(temp + " is not palindrome");
    }
}