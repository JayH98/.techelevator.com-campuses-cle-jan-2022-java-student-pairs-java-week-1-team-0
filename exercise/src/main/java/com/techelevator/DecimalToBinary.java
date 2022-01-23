package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

		 Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter in a series of decimal values (separated by spaces): ");
		 String userValue = scanner.nextLine();
		System.out.println(userValue);

		String [] storeQuotient = userValue.split(" ");

		int[] decimals = new int [storeQuotient.length];

		for (int i = 0; i < storeQuotient.length; i++) {
			decimals[i] = Integer.parseInt(storeQuotient[i]);


		}


			do {
				int remainder = decimals[0] % 2;
				decimals[0] = decimals[0] / 2;
				System.out.print(remainder + " ");

			}
			while (decimals[0] > 0);


//		if (userValue <= 0) {
//			System.out.println("Input must be a positive number!");
//			break;
		}



	}

