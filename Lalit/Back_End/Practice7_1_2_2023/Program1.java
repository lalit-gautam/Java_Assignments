package Practice7_1_2_2023;

public class Program1 {
    public static void main(String[] args) {

        // problem 1
        int rows = 5;
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j <= i; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }


        System.out.println("\n\n\n");


        //problem 2

         rows = 5;
        for (int i = 0; i <rows; i++) {
            for (int j = rows-i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++ ) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
