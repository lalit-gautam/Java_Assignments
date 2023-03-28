package Practice_30_23_3_2023;

public class Program1 {
    public static void main(String[] args) {

        // java program to subtract 2 matrices
        int rows, cols;

        int [][] arr1 = {{4, 5, 6},
                {3, 4, 1},
                {1, 2, 3}
        };

        int [][] arr2 = {{2, 0, 3},
                {2, 3, 1},
                {1, 1, 1}
        };

        rows = arr1.length;
        cols = arr1[0].length;

        int [][] difference = new int[rows][cols];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                difference[i][j] = arr1[i][j] - arr2[i][j];
            }
        }

        System.out.println("Substraction of 2 matrices : ");

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(difference[i][j] + " ");
            }
            System.out.println();
        }
    }
}
