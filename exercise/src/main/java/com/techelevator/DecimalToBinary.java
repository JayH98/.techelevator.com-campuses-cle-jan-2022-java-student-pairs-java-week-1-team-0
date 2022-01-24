package com.techelevator;

import java.util.ArrayList;
import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter in a series of decimal values (separated by spaces): ");
		String userValues = scanner.nextLine();
		String[] decimalValuesAsString = userValues.split(" ");			// turn user input into an array of strings
		int[] decimalValuesAsInt = new int[decimalValuesAsString.length];		// create new integer array to later hold user input as ints

		for (int i = 0; i < decimalValuesAsString.length; i++) {
			decimalValuesAsInt[i] = Integer.parseInt(decimalValuesAsString[i]);     // parse user input from string to integer and assign values to integer array
		}

		int[] remainders = new int[200];											//array used to keep track of remainders
		int timesRanThrough = 0;
		for (int i = 0; i < decimalValuesAsInt.length; i++) {
			int quotient = decimalValuesAsInt[i];								// set first user input to quotient to later be divided down to 0
			System.out.print(+decimalValuesAsInt[i] + " in binary is ");

			int quotientRemainder = quotient % 2;
			for (int j = 0; j < 100; j++) {
				if (quotient == 0) {
					break;
				}
				remainders[j] = quotientRemainder;
				quotient = quotient / 2;									// Math used to get binary numbers
				quotientRemainder = quotient % 2;							//
				timesRanThrough += 1;										// used to keep track of pseudo-size of array
			}
			for (int k = timesRanThrough-1; k >= 0; k--) {
				System.out.print(remainders[k]);							// prints out remainders in correct order for binary
			}
			timesRanThrough = 0;										// resets timesRanThrough to be reused in loop
			System.out.println();
		}
		System.out.println("This was difficult to figure out Ben!!!!"); // Our group being cheeky ^-^

//

	}

	}

