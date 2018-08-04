package week5.dailychallenge;

import java.util.Scanner;

public class PrintUniqueCharactersInString {

	public static void main(String[] args) {
		
		/* Write a Java program to identify and form a string using unique characters.
		 *  
		 *  Ex : Input - Good Looking.
		 *  Output - godlkin. (but got output as odking )
		 */
		
		Scanner scr =new Scanner(System.in);
		System.out.println("Enter the String : ");
		String actualString = scr.nextLine();
		
		String uniqueString= "";
		
		String modifiedString = actualString.replaceAll("[A-Z]","");
		
		for ( int i =0; i< modifiedString.length(); i++)
		{
			// If the 'a' is present in string, it returns the index(>=0). 
			// If not, it returns -1. So, a non-negative return value means that 'a' is present in the string.
			
			if (uniqueString.indexOf(modifiedString.charAt(i)) == -1)
			{
				uniqueString = uniqueString + modifiedString.charAt(i);
			}
		}
		
		System.out.println(uniqueString.replaceAll("\\s", ""));
		
	}

}
