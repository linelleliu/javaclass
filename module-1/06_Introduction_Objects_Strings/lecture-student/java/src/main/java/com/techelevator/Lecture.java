package com.techelevator;

import java.util.Locale;

public class Lecture {

	public static void main(String[] args) {
		/*
		VIN Numbers:
		1GNSCBE09ER147271
		1FAHP3F24CL127125
		3GNEC13T73G142264
		1MEFM50U85A612817
*/


		System.out.println("************************************");
		System.out.println("****** MAKING A STRING OBJECT ******");
		System.out.println("************************************");

		/* The String class gets special treatment in the Java language.  One
		 * example of this is that there is a literal representation of a
		 * String (i.e. characters appearing between two double quotes.  This
		 * is not the case for most classes */

		/* create an new instance of String using a literal */

		
		System.out.println();
		System.out.println("******************************");
		System.out.println("****** MEMBER METHODS ******");
		System.out.println("******************************");
		System.out.println();

		String vin = "1GNSCBE09ER147271 ";
		char manufacturer = vin.charAt(1);
		System.out.println(manufacturer);
		char countryCode = vin.charAt(0);

		// If the car is made in the USA, and it's a ford printout FORD-USA
		if (countryCode == '1' && manufacturer == 'F') {
			System.out.println("FORD-USA");
		} else {
			System.out.println("OTHER");
		}

		int lengthOfVin = vin.length();
		System.out.println("The length of a VIN number is: " + lengthOfVin);

		int vinClean = vin.trim().length();
		System.out.println("The cleaned up VIN number has a length of " + vinClean);

		int position = vin.indexOf("YZZ");
		System.out.println(position);

		String carFeatures = vin.substring(3,8);
		System.out.println(carFeatures);

		String lowerCaseVin = vin.toLowerCase();
		System.out.println(lowerCaseVin);

		boolean hasMyLetters = vin.contains("934");
		System.out.println(hasMyLetters);

		String bar = "AAA ";
		bar = bar.trim();
		System.out.println("Length of bar: " + bar.length());
		bar = bar.toLowerCase();
		System.out.println("The value of bar " + bar);

		/* Other commonly used methods:
		 *
		 * endsWith
		 * startsWith
		 * indexOf
		 * lastIndexOf
		 * length
		 * substring
		 * toLowerCase
		 * toUpperCase
		 * trim
		 */

		System.out.println();
		System.out.println("**********************");
		System.out.println("****** EQUALITY ******");
		System.out.println("**********************");
		System.out.println();

		String hello1 = "POTATO";
		String hello2 = new String("POTATO");

		char [] charArray = {'P', 'O', 'T', 'A', 'T', 'O'};
		String hello4 = new String(charArray);

		/* Double equals will compare to see if the two variables, hello1 and
		 * hello2 point to the same object in memory. Are they the same object? */
		if (hello1 == hello2) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}

		String hello3 = hello1;
		if (hello1 == hello3) {
			System.out.println("hello1 is the same reference as hello3");
		}

		/* So, to compare the values of two objects, we need to use the equals method.
		 * Every object type has an equals method */
		if (hello1.equals(hello2)) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}

		String str = "a";
//		if (str.length() >= 2) {
//			String firstTwo = str.substring(0, 2);
//			return firstTwo;
//		} else if (str.length() == 1) {
//			char oneString = str.charAt(0);
//			System.out.println(oneString);
//
//		} else {
//			return "";
//		}
	}
}
