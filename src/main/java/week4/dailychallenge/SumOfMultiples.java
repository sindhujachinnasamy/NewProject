package week4.dailychallenge;

import java.util.Scanner;

public class SumOfMultiples {

	public static void main(String[] args) {
		/* Find the sum of all multiples of 3 or 5 less than 100.
		 * 
		 * Ex : For 20, the multiples of 3 or 5 less than 20 are
		 * 3, 5, 6, 9, 10, 12, 15, 18. So their sum is 78.
		 */

		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = scr.nextInt();
		int sumOfDigits = 0;

		for ( int i = 1; i < number ; i++ )
		{
			if ( i%3 ==0 || i%5 ==0)
				sumOfDigits = sumOfDigits + i ;
		}
		System.out.println(sumOfDigits);
	}

}
