//Java program to add the digits of a given number using recursive function
import java.util.Scanner;

public class Assignment2 {
    static int sum=0,rem;
    public static void main(String ...args){
        int result;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number- ");  
        int originalNum= sc.nextInt();  
        result = sumOfDigits(originalNum);
        sc.close();
        System.out.println("Sum = "+result);
    }
    static int sumOfDigits(int num)
    {
            sum = sum + (num%10);
            rem = num/10;
            if(rem > 0)
            {
                sumOfDigits(rem);
            }
            return sum;
    }

}
