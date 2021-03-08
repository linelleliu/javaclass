package com.techelevator;

import java.util.Arrays;
import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
//		Please enter in a series of decimal values (separated by spaces): 460 8218 1 31313 987654321
//		460 in binary is 111001100
//		8218 in binary is 10000000011010
//		1 in binary is 1
//		31313 in binary is 111101001010001
//		987654321 in binary is 111010110111100110100010110001
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter in a series of decimal value (separated by spaces): ");
		String numInput = scanner.nextLine();
		String [] inputList = numInput.split("\\ ");
		System.out.println(Arrays.toString(inputList));
		for (int i=0; i < inputList.length; i++) {
			int numInputArray = Integer.parseInt(inputList[i]);
			String binary = "";

			while (numInputArray > 0) {
				int remainder = numInputArray%2;
				binary = remainder + binary;
				numInputArray = numInputArray/2;

//				System.out.println(binary);
			}
			System.out.println(inputList[i] + " in binary is " + binary );

		}
	}

}
