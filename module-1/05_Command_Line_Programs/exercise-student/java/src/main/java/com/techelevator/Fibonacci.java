package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
//		Please enter the Fibonacci number: 25
//		0, 1, 1, 2, 3, 5, 8, 13, 21
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the Fibonacci number: ");
		String numberInput = scanner.nextLine();
		int currentNum = 0;
		int nextNum = 1;
		while (currentNum <= Integer.parseInt(numberInput)) {
			int temp = currentNum;
			currentNum = nextNum;
			nextNum = nextNum + temp;
			System.out.println(temp);
		}


	}

}
