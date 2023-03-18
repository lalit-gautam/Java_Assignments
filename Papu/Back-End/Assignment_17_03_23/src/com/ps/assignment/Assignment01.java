//To show to upper triangular matrix
package com.ps.assignment;
public class Assignment01 {

	public static void main(String[] args) {
		int [][]matrix= {{1,6,8},{1,8,10},{4,8,9}};
		int rows=matrix.length;
		int cols=matrix[0].length;
		printUprTringularMatrix(matrix, rows, cols);
	}
	//To convert the matrix the matrix in upper triangular matrix
	public static void printUprTringularMatrix(int mat[][],int row,int col)
	{
		if(row!=col)
		{
			System.out.println("The matrix is should be squer matrix");
		}
		else {
			{
				for(int i=0;i<row;i++)
				{
					for(int j=0;j<col;j++)
					{
						if(i<=j)
						{
							System.out.print(mat[i][j]+" ");
						}
						else 
						{
							System.out.print("0 ");
						}
					}
					System.out.println();
				}
			}
		}
	}
}
