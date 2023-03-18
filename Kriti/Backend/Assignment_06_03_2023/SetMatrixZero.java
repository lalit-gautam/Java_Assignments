import java.util.*;


class SetMAtrixZero{

    public static void main(String[] args) {
        int[][] arr= {{1,2,3},
                      {4,0,6},
                      {7,8,9}};
        System.out.println("after setting all zeros : ");
        setZeros(arr);
        for(int[] ans: arr){
            System.out.println(Arrays.toString(ans));
        }
    }


// Question
// https://www.codingninjas.com/codestudio/problems/set-matrix-zeros_3846774?leftPanelTab=0

    public static void setZeros(int[][] matrix) {
        // Write your code here..
        int[][] ans = new int[matrix.length][matrix[0].length];
        for(int i=0;i<ans.length;i++){
            
            for(int j=0;j<ans[0].length;j++){
                ans[i][j] = matrix[i][j];
            }
        }
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    setRowZero(ans, i, j);
                    setColumnZero(ans, i , j);

                }
            }
        }
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                matrix[i][j] = ans[i][j];
            }
        }
    }
    public static void setRowZero(int matrix[][] , int row , int col ){
        for(int i=0;i<matrix[row].length;i++){
            matrix[row][i] = 0;
        }
    }
    public static void setColumnZero(int matrix[][] , int row , int col){
        for(int i=0;i<matrix.length;i++){
            matrix[i][col] = 0;
        }
    }
}




