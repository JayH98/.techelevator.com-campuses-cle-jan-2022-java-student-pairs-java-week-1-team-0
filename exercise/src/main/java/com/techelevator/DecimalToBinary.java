package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter in a series of decimal values (separated by spaces): ");
		String userValues = scanner.nextLine();
		String[] decimalValues = userValues.split(" ");
		int[] decimalValuesInInt = new int[decimalValues.length];

		for (int i = 0; i < decimalValues.length; i++) {
			decimalValuesInInt[i] = Integer.parseInt(decimalValues[i]);
		}
		//int quotient = 0;

		for (int i = 0; i < decimalValuesInInt.length; i++) {
			int quotient = decimalValuesInInt[i];
			System.out.print(+decimalValuesInInt[i] + " in binary is ");

			do {
				int quotientRemainder = quotient % 2;
				quotient = quotient / 2;
				System.out.print(quotientRemainder);
			} while (quotient > 0);
			System.out.println();
		}

//

	}

	}

