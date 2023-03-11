public class Pattern2 {
    public static void main(String[] args) {
        int noOfrows = 4;
        pattern2(1, 1, 1, noOfrows);
    }

    static void pattern2(int row, int column, int i, int no) {
        if (row > no) {
            return;
        }
        if (row % 2 != 0) {
            if (column <= no) {

                System.out.print(i + " ");
                pattern2(row , column + 1, i + 1, no);

            } else if (row < no) {

                System.out.println();
                pattern2(row + 1, 1, i + no - 1, no);
            }
        } else {
            if (column <= no) {

                pattern2(row , column + 1, i - 1, no);
                System.out.print(i + " ");

            } else {

                pattern2(row + 1, 1, i + no + 1, no);

                if (row != no) {
                    System.out.println();
                }

            }
        }

    }
}
