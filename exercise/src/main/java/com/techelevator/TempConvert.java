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
			double temperatureInFahrenheit = toFarenheit;
			System.out.println(temp + "C is " + temperatureInFahrenheit + "F");
		}
		else if (tempType.equals("F")) {
			double temperatureInCelsius = toCelsius;
			System.out.println(temp + "F is " + temperatureInCelsius + "C");
		}
		else {
			System.out.println("Input must be capital F or capital C. Try again!");
		}

	}

}
