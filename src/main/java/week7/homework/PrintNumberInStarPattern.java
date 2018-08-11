package week7.homework;

import java.util.Scanner;

public class PrintNumberInStarPattern {

	public static void main(String[] args) {
		
		/*  Write a Java program to print below pattern like a star.
		 * 
		 * 	Ex - input : 5
		 * 
		 * 	  1
		 *   123
		 *  12345
		 *   123 
		 *    1
		 * */
		
	

		Scanner scr = new Scanner(System.in);
		System.out.println("Please Enter the Number : ");
		int num = scr.nextInt();
		scr.close();

		for ( int i=1 ; i <=(num/2)+1 ; i ++)
		{
			for ( int j=i ; j<= num/2 ; j++)
			{
				System.out.print(" ");
			}
			for ( int k= 1; k <(i*2); k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}

		for ( int i = (num/2) ; i>=1 ; i-- )
		{
			for ( int j = num/2 ; j>=i ;j--)
			{
				System.out.print(" ");
			}
			for ( int k=1 ; k< (i*2) ; k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}

}
