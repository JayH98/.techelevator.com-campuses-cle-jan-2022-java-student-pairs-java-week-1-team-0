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
			double lengthInMeters = Math.round(toMeters);
			System.out.println(length + "f is " + lengthInMeters + "m");
		}
		else if (lengthType.equals("m")) {
			double lengthInFeet = Math.round(toFeet);
			System.out.println("m is " + lengthInFeet + "f");
		}
		else {
			System.out.println("Input must be m or f. Try again!");
		}

	}

}
