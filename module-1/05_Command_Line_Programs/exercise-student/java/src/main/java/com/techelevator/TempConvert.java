package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

//		Please enter the temperature: 58
//		Is the temperature in (C)elsius, or (F)ahrenheit? F
//		58F is 14C.
		System.out.println("Temperature Convertor");
		System.out.println("Please enter the temperature: ");
		String temperatureInput = scanner.nextLine();
		System.out.println("The temperature you entered was: " + temperatureInput);

		System.out.println("Is the temperature in (C)elsius or (F)ahrenheit? (Please enter C for Celsius and F or Fahrenheit): ");
		String temperature = scanner.nextLine();
		double temperatureNum = Double.parseDouble(temperatureInput);
		if (temperature.equals("C") || temperature.equals("c")) {
			double tempF = (temperatureNum * 1.8) + 32;
			System.out.println(temperatureInput +"C is " + (int)tempF +"F");
		} else if (temperature.equals("F") || temperature.equals("f")) {
			double tempC = (temperatureNum - 32) / 1.8;
			System.out.println(temperatureInput +"F is " + (int)tempC +"C");
		} else {
			System.out.println("Not the right input");
		}
	}

}
