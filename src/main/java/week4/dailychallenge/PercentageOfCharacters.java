package week4.dailychallenge;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PercentageOfCharacters {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String stringInput = scr.nextLine();
int stringLength = stringInput.length();
		int upperCaseCount =0, lowerCaseCount =0, digitsCount =0, specialCharCount=0;

		for ( int i = 0;i<stringLength; i++)
		{
			char ch = stringInput.charAt(i);
			if ( Character.isUpperCase(ch))
				upperCaseCount++;
			else
				if ( Character.isLowerCase(ch))
					lowerCaseCount++;
				else
					if ( Character.isDigit(ch))
						digitsCount++;
					else
						specialCharCount++;
		}
		
		double upperCasePercentage = (upperCaseCount*100)/stringLength;
		double lowerCasePercentage = (lowerCaseCount*100)/stringLength;
		double digitsPercentage = (digitsCount*100)/stringLength;
		double specialCharPercentage = (specialCharCount*100)/stringLength;
		
		DecimalFormat format=new DecimalFormat("##.##");
		
		System.out.println("Number of Uppercase Letters is : "+upperCaseCount+". So percentage is : "+upperCasePercentage);
		System.out.println("Number of Lowercase Letters is : "+lowerCaseCount+". So percentage is : "+lowerCasePercentage);
		System.out.println("Number of digits Letters is : "+digitsCount+". So percentage is : "+digitsPercentage);
		System.out.println("Number of other Characters is : "+specialCharCount+". So percentage is : "+specialCharPercentage);
	
	}

}
