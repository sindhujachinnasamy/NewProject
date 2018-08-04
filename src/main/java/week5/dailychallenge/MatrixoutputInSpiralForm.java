package week5.dailychallenge;

import java.util.Scanner;

public class MatrixoutputInSpiralForm {

	public static void main(String[] args) {
		
		/* Write a simple Java program to construct a 4 * 4 Matrix 
		 * and print the matrix contents in spiral form.
		 * 
		 * EX : 1	2	3	4
		 * 		5	6	7	8
		 * 		9	10	11	12
		 * 		13	14	15	16
		 * 
		 * 1	2	3	4	5	6	7	8	9	10	11	12	13	14	15	16
		 */
		
		//declare a 4*4 matrix
		int[][] matrix = new int[4][4];

		//Get input from the user
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the values of Matrix : " );

		for ( int i =0; i<4 ; i++ )
		{
		for ( int j =0; j<4 ; j++ )
		{
		matrix[i][j] = scr.nextInt();
		}
		}

		// Matrix entered to print in Spiral form is :
		System.out.println("Matrix entered to print in Spiral form is :");
		for ( int i =0; i<4 ; i++ )
		{
		for ( int j =0; j<4 ; j++ )
		{
		System.out.print(matrix[i][j]+"\t");
		}
		}
		
		int rowStartingIndex =0, 
				rowEndingIndex =4, 
				columnStartingIndex =0, 
				columnEndingIndex =4, i;
		
		// To print the values in Spiral form :
		System.out.println();
		System.out.println("Entered matrix in Spiral form is :");
		
		while ( rowStartingIndex < rowEndingIndex  && columnStartingIndex < columnEndingIndex )
		{
			for ( i = columnStartingIndex ; i< columnEndingIndex; i++)
			{
				System.out.print(matrix[rowStartingIndex][i]+"\t");
				
			}
			rowStartingIndex++;
			for ( i = rowStartingIndex ; i< rowEndingIndex; i++)
			{
				System.out.print(matrix[i][columnEndingIndex-1]+"\t");
				
			}	
			columnEndingIndex--;
			
			if ( rowStartingIndex < rowEndingIndex)
			{
				for ( i = columnEndingIndex-1 ; i>= columnStartingIndex; i--)
				{
					System.out.print(matrix[rowEndingIndex-1][i]+"\t");
					
				}	
				rowEndingIndex--;
			}
			
			if ( columnStartingIndex < columnEndingIndex)
				
				for ( i = rowEndingIndex-1 ; i>= rowStartingIndex; i--)
				{
					System.out.print(matrix[i][columnStartingIndex]+"\t");
					
				}
				columnStartingIndex++;
			}
		}
			

	}


