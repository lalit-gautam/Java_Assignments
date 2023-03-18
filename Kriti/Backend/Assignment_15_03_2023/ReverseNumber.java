package Assignment_20_15_03_2023;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Reverse : "+getReverse(num));
    }
    public static int getReverse(int num){
        int sum = 0;
        while(num>0){
            sum = (sum*10) + (num%10);
            num/=10;
        }
        return sum;
    }
}
