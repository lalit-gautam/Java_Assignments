//To check a matrix is identity matrix or not
package com.ps.assignment;

public class Assignment02 {

	public static void main(String[] args) {
		int [][]matrix= {{1,0,0},{0,1,0},{0,0,1}};
		int rows=matrix.length;
		int cols=matrix[0].length;
		if(isIdentity(matrix, rows, cols))
		{
			System.out.println("identity matrix");
		}
		else 
		{
			System.out.println("Not a identity matrix");
		}

	}
	//to check a matrix is identity matrix 
	public static boolean isIdentity(int mat[][],int row,int col)
	{
		boolean flat=true;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(i!=j && mat[i][j]!=0)
				{
					return false;
				}
				else if (j==i && mat[i][j]!=1) {
					return false;
				}
			}
		}
		return flat;
	}

}
