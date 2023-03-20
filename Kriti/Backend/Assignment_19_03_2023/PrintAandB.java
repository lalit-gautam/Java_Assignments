package Assignment_19_03_2023;

public class PrintAandB {

    public static void main(String[] args) {
        printA(12);
        printB(12);
    }


    public static void printA(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            int j = 0;
            System.out.print("*");
            for (j = 0; j < i; j++) {
                if(i==n/2){
                    System.out.print("**");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.print("*");


            System.out.println();
        }


    }

    public static void printB(int n) {
        for (int i = 0; i <= n; i++) {
            if (i == 0 || i == n / 2 || i == n) {
                for (int j = 0; j < n / 2 - 2; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            } else {
                System.out.print("*");
                for (int j = 0; j <= n / 2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }
}
