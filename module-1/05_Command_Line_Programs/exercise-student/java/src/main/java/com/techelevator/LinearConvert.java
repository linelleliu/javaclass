package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
//		m = f * 0.3048
//		f = m * 3.2808399
//		Please enter the length: 58
//		Is the measurement in (m)eter, or (f)eet? f
//		58f is 17m.

		Scanner scanner = new Scanner(System.in);
		System.out.println("Meters - Feet");
		System.out.println("Please enter the length: ");
		String lengthInput = scanner.nextLine();
		System.out.println("Is the measurement in (m)eter, or (f)eet? Enter m for meter or f for feet.");
		String measurementInput = scanner.nextLine();
		double measurementNum = Double.parseDouble(lengthInput);
		if (measurementInput.equals("m") || measurementInput.equals("M")) {
			double feet = measurementNum * 3.2808399;
			System.out.println((int)feet +"f");
		} else if (measurementInput.equals("f") || measurementInput.equals("F")) {
			double meter = measurementNum * 0.3048;
			System.out.println((int)meter +"m");
		} else {
			System.out.println("Not the right input");
		}
	}

}
