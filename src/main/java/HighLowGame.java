/**
	* File: Problem Set Unit 4
	* Author: Visaagan Gunabalachandran
	* Date Created: Jan 25, 2026
	* Date Last Modified: April 27, 2026
	*/

import java.util.Scanner;
import java.util.Random;

public class HighLowGame {
	public static void main(String[] args) {

		//introduction code
		Scanner input = new Scanner(System.in);
		Random r = new Random();

		int rounds;
		int score = 0;

		System.out.println("Welcome to the High Low Guessing Game.\n");

		System.out.print("Input a number of rounds to play: ");
		rounds = input.nextInt();

		//accounting for input validation by disallowing negative numbers or zero
		while (rounds < 0) {
			System.out.println("\nInvalid Input!");
			System.out.print("Input a number of rounds to play: ");
			rounds = input.nextInt();
		}
		// while

		//using a for loop to keep rounds going
		for (int i = 1; i <= rounds; i++) {

				System.out.println("\nRound " + i + ":\n");

				int choice;

				//using a do while loop so that the user must pick 1, 2, or 3
				do {
					System.out.println("Please select High, Low or Even:");
					System.out.println("1. High (11 to 20)");
					System.out.println("2. Low (0 to 9)");
					System.out.println("3. Even (10)\n");

					choice = input.nextInt();

					if (choice < 1 || choice > 3) {
						System.out.println("\nInvalid input!");
					}

				} while (choice < 1 || choice > 3);

				int number = r.nextInt(21);

				System.out.print("\nThe number was " + number + ". ");

				//checking to see if answer is correct
				if ((choice == 1 && number >= 11) ||
				        (choice == 2 && number <= 9) ||
				        (choice == 3 && number == 10)) {

					System.out.println("You were correct.");
					score = score + 1;
				} else {
					System.out.println("You were incorrect.");
				}

				System.out.println("Current Score: " + score);
			}

		System.out.println("\nTotal Score: " + score);

		//checking to see if player got at least half correct
		if (score >= (rounds / 2.0)) {
			System.out.println("Congratulations you got " + score + " out of " + rounds + " rounds right!");
		} else {
			System.out.println("Better luck next time! You got " + score + " out of " + rounds + " rounds right!");
		}

	}
}
