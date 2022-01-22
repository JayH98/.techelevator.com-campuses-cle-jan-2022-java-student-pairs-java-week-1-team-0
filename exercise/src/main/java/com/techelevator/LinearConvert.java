package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the length: ");
//		String length = scanner.nextLine();
		double length = Double.parseDouble(scanner.nextLine());
		System.out.print("Is your length meters(m) or feet(f)? ");
		String lengthType = scanner.nextLine();
		double toMeters = length * 0.3048;
		double toFeet = length * 3.2808399;


		if (lengthType.equals("f")) {
			double lengthInFeet = toMeters;
			System.out.println("The length is " + lengthInFeet + " meters");
		}
		else if (lengthType.equals("m")) {
			double lengthInMeters = toFeet;
			System.out.println("The length is " + lengthInMeters + " feet");
		}
		else {
			System.out.println("Input must be m or f. Try again!");
		}

	}

}
