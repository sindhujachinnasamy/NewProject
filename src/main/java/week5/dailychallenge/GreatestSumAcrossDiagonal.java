package week5.dailychallenge;

import java.util.Scanner;

public class GreatestSumAcrossDiagonal {

	public static void main(String[] args) {
		/*Write a simple Java program to print the numbers which has the greatest sum across the diagonal. 
		 * Code must be generic for NxN matrix.
		Ex -  1      2     3     4
			  5      6     7     8
			  9      10    11    12
			  13     14    15    16
		The diagonal is 4,7,10,13.  
		The numbers across the diagonal are 1,2,3,5,6,9 and 8,11,12,14,15,16. 
		Their sum is 22 and 76. So the output should be 8,11,12,14,15,16.*/
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the row count : ");
		int rowCount = scr.nextInt();
		int matrix[][] = new int[rowCount][rowCount];
		
		for ( int i =0; i < rowCount ; i++)
		{
			for ( int j =0; j < rowCount ; j++)
			{
				System.out.println("Enter the value for row "+(i+1)+" and column "+(j+1)+" :");
				matrix[i][j] = scr.nextInt();
				
			}
		}
		
		scr.close();
		
		

	}

}
