package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		long[] firstTwoInFib = {0,1};
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a whole number: ");
		long userInput = Long.parseLong(scanner.nextLine());
		System.out.print("All numbers leading up to " + userInput + " are: ");

		for (int i = 0; i <= userInput; i++){
			if (userInput <= 0){
				System.out.println("0, 1");
				break;
			}
			else if (userInput == 1){
				System.out.println("0, 1, 1");
				break;
			}
			firstTwoInFib[0] = firstTwoInFib[0] + firstTwoInFib[1];

			if (userInput < firstTwoInFib[0]) {
				break;
			}
			else if (userInput == firstTwoInFib[0]){
				System.out.print(userInput);
				break;
			}
			System.out.print(firstTwoInFib[0] + " ");
			firstTwoInFib[1] = firstTwoInFib[0] + firstTwoInFib[1];

			if (userInput < firstTwoInFib[1]){
				break;
			}  else if (userInput == firstTwoInFib[1]){
				System.out.print(userInput);
				break;
			}
			System.out.print(firstTwoInFib[1] + " ");
		}
		System.out.println("Thank you for playing!");

	}

}
