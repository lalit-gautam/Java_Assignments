import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {
    static Scanner sc;
    static double num1, num2;   
    public static void main(String[] args) {
        try {
            ExceptionExample ex1 = new ExceptionExample();

            System.out.println("Enter numerator: ");
            ex1.takeInputOfNum1();
            System.out.println("Enter denominator: ");
            ex1.takeInputOfNum2();
            division(num1, num2);
        } finally {
            sc.close();
        }
    }

    static void division(double num1, double num2) {
        double result = 0;
        try {
            result = num1 / num2;
            if (Double.isNaN(result)) {
                throw new ArithmeticException();
            }
            if (num2 == 0) {
                throw new ArithmeticException();
            }
            System.out.println("The ans is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("can't divide by zero");
            System.exit(0);
        }

    }

    boolean takeInputOfNum1() {
        sc = new Scanner(System.in);
        try {
            num1 = sc.nextDouble();
            return true;
        } catch (InputMismatchException e) {
            System.out.println("please enter correct input ");
            return takeInputOfNum1();
        }
    }

    boolean takeInputOfNum2() {
        sc = new Scanner(System.in);
        try {
            num2 = sc.nextDouble();
            return true;
        } catch (InputMismatchException e) {
            System.out.println("please enter correct input ");
            return takeInputOfNum2();
        }
    }
}
