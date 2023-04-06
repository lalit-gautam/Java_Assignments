package Practice28_21_3_2023;

public class Program2 {
    public static void main(String[] args) {

        fibonacci(10);
    }

    public static void fibonacci(int n) {

        int num1 = 0;
        int num2 = 1;
        int num3;

        System.out.print(num1 + "  " + num2);

        for(int i = 2; i < n; i++){
            num3 = num1 + num2;
            System.out.print("  " + num3);
            num1 = num2;
            num2 = num3;
        }
    }
}
