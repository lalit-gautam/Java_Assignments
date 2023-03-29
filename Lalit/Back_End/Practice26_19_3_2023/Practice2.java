package Practice26_19_3_2023;

public class Practice2 {
    public static void main(String[] args) {

        // program to print pyramid pattern
        printPyramid(4);

        printPyramid(7);

    }

    public static void printPyramid(int row){
        int i, j;
        for (i=0; i<row; i++){
            for (j=row-i; j>1; j--) {
                System.out.print(" ");
            }
            for (j=0; j<=i; j++ ) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
