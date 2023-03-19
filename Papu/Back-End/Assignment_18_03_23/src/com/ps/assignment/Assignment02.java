//to find the sum of each row  column of a matrix
package com.ps.assignment;

public class Assignment02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]matrix= {{1,6,8},{1,8,10},{4,8,9}};
		int rows=matrix.length;
		int cols=matrix[0].length;
		sumRow(matrix, rows, cols);

	}
	//To find each row sum
	public static void sumRow(int mat[][],int row ,int col)
	{
		for(int i=0;i<row;i++)
		{
			int sum=0;
			for(int j=0;j<col;j++)
			{
				sum+=mat[i][j];
			}
			System.out.println("The sum of "+i+"th is "+sum);
		}
	}

}
