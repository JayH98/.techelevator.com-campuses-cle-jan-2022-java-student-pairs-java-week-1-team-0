package com.techelevator;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter your temperature: ");
		// String temp = scanner.nextLine();
		double temp = Double.parseDouble(scanner.nextLine());
		System.out.print("Is this temperature Celsius(C) or Farenheit(F)? ");
		String tempType = scanner.nextLine();
		double toFarenheit = temp * 1.8 + 32;
		double toCelsius = (temp - 32) / 1.8;



		if (tempType.equals("C")) {
			double temperatureInCelsius = toFarenheit;
			System.out.println("The temperature is " + temperatureInCelsius + "F");
		}
		else if (tempType.equals("F")) {
			double temperatureInFarenheit = toCelsius;
			System.out.println("The temperature is " + temperatureInFarenheit + "C");
		}
		else {
			System.out.println("Input must be capital F or capital C. Try again!");
		}

	}

}
