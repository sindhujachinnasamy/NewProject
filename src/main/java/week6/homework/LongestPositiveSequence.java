package week6.homework;

public class LongestPositiveSequence {

	public static void main(String[] args) {
	/*	Write a simple Java program to print the longest positive sequence from given input of number 
	 * and find the length of the sequence. 
	 * Ex - Input = -1, 2,-3,-4,5,6,7,-8,9,10
	 * Output = 5 6 7
	 * Length is 3
	 */
		
		
		

		int[] numberArray = {-1, 2,-3,-4,5,6,7,-8,9,10 };
		int arrayLength = numberArray.length;
		int[] positiveSeq = new int[10];
		int count=0, maxCount=0;
		
		for ( int i=0; i< arrayLength ; i++)
		{
			if ( numberArray[i] >0)
			{
				count++;
				positiveSeq[i] = numberArray[i];
			}
		}

		for ( int i=0; i< arrayLength ; i++)
		{
			System.out.println(positiveSeq[i]);
		}





	}

}
