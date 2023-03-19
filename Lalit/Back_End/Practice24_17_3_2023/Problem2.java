package Practice24_17_3_2023;

public class Problem2 {
    public static void main(String[] args) {

        printTriangle(5);
        printTriangle(3);
    }

    public static void printTriangle(int nums){

        for(int i = 0; i < nums; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*

            *
            * *
            * * *
            * * * *
            * * * * *

     */
}
