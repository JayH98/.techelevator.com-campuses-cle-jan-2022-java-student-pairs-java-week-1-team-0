package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		long[] firstTwoInFib = {0,1};							//creates array with first two values of Fibonacci sequence
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
			firstTwoInFib[0] = firstTwoInFib[0] + firstTwoInFib[1];				//updates array to next number in fibonacci sequence

			if (userInput < firstTwoInFib[0]) {									// checks if sequence has gone past the users number, terminates loop if true
				break;
			}
			else if (userInput == firstTwoInFib[0]){							// checks if sequence number is the same as user's number, prints out final number if true, then terminates loop
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
		System.out.println();
		System.out.print("Thank you for playing!");

	}

}
