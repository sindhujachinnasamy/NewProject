package week7.homework;

import java.util.Scanner;

public class FindStringHas5Characters {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String value = scr.next();

		if ( value.length() == 5 )
		 System.out.println("true");
		else
		 System.out.println("false");

	}

}
