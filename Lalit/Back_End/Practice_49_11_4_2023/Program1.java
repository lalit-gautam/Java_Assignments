package Practice_49_11_4_2023;

import java.util.Scanner;

// program to find the permutation and combination of the number

public class Program1 {
    public static void main(String[] args) {
        int n, r;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Value of n : ");
        n = scan.nextInt();
        System.out.print("Enter Value of r : ");
        r = scan.nextInt();

        System.out.print("NCR = " + (fact(n) / (fact(n - r) * fact(r))));
        System.out.print("nNPR = " + (fact(n) / (fact(n - r))));
    }

    public static int fact(int num) {
        int fact = 1, i;
        for (i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
