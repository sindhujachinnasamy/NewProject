package week4.dailychallenge;

public class NextLargestNumber {

	public static void main(String[] args) {
		/* Get two inputs ( 1 Number and 1 Digit ) from user.
		 * Write a java program to find the largest number that is less than the given number 
		 * and also should not contain the given digit.
		 * 
		 * For ex, If 154 is the given number and 5 is the given digit,then you should find the largest number
		 * less than 154 such that it should not contain 5 in it. In this case, 149 will be the answer.
		 */

		int number = 154;
		int digit = 5;

		largestNumber (number,digit);

	}

	public static void largestNumber ( int givenNumber, int digit )
	{


		for (int i = givenNumber; i>=1; i--)
		{
			int count = 0;
			int nextLargestNumber = i ;
			int singleDigit;
			while ( nextLargestNumber != 0 )
			{
				singleDigit = nextLargestNumber%10;
				nextLargestNumber = nextLargestNumber/10;
				if ( singleDigit == digit)
				{
					count++;
					break;
				}

			}

			System.out.println("Result is "+i);
			break;


		}

	}

}
