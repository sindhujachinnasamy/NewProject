package week4.dailychallenge;

import java.util.Scanner;

public class VerificationOfValidPassword {
	
	/* Write a Java Method to check whether a string is a valid password
	 * Password rules :
	 * A Password must have at least ten characters
	 * A Password consists of only letters and digits
	 * A Password must contain at least two digits and two letters
	 * A Password must contain at least one Capital letter
	 */

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the Password : ");
		String password = scr.next();
		
		verifyPassword(password);
	
	}

public static void verifyPassword(String password)
{
	// Get the length of the String
	//		int length = password.length();

			// extracting only  digits from password
			String digits = password.replaceAll("[^0-9]","");
			System.out.println("Digits in the password : "+digits);
			// length of digits in password
	//		int digitsCount = digits.length();

			// extracting only letters from password
			String letters = password.replaceAll("[^a-zA-Z]", "");
			System.out.println("Letters in the password : "+letters);
			// length of letters in password

			String capitalLetters = password.replaceAll("[^A-Z]", "");
			System.out.println("CapitalLetters in the password : "+capitalLetters);
			System.out.println(letters);
			// length of letters in password

			if (password.length() < 10)
			{
				System.out.println("Length of the Password is less than 10 characters");
			}else 
				if (digits == "" || letters == "")
				{
					System.out.println("Password must contain both digits and letters");
				}else
					if (digits.length() < 2 || letters.length() < 2)
					{
						System.out.println("Password must contain 2 digits and 2 letters");
					}else 
						if (capitalLetters.length() <1)
						{
							System.out.println("Password must contain atleast one Capital Letter");

						}else
							System.out.println(password+ " is a Valid Password");
}
}