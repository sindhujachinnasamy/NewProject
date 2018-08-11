package week7.homework;

import java.util.Scanner;

public class PerfectNumber {

	/* Write a simple Java Program to find a number whether its a perfect number or not.
	 * 
	 * A perfect number is a positive integer that is equal to the sum of its proper positive divisors, 
	 * that is, the sum of its positive divisors excluding the number itself (also known as its aliquot sum). 
	 * Equivalently, a perfect number is a number that is half the sum of all of its positive divisors
	 * 
	 * Ex : 28 is a perfect number. 1+2+4+7+14 = 28
	 * and (1+2+4+7+14+28)/2 = 56/2 = 28 
	 * */
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int number = scr.nextInt();
		int sum = 0;
		
		for ( int i=1; i<=number/2 ; i++)
		{
			if ( number%i == 0)
				sum = sum+i;
		}
		// System.out.println(sum);
		if ( sum == number && ((sum+number)/2==number))
			System.out.println(+number+ " is a Perfect Number");
		else
			System.out.println(+number+ " is NOT a Perfect Number");
	}

}
