package com.coderscampus.game;

import java.util.Random;
import java.util.Scanner;

public class GuessingGameApplication {

	public static void main(String[] args) {

		Random random = new Random();
		int randomNumber = random.nextInt(100) + 1;// Generate a random number between 1 and 100

		try (Scanner scanner = new Scanner(System.in)) {

			int userInput;
			int guessCount = 0;

			while (guessCount < 5) {
				System.out.println("Pick a number between 1 and 100");
				userInput = scanner.nextInt();

				if (userInput < 1 || userInput > 100) { // validation check for invalid
					System.out.println("Your guess is not between 1 and 100, please try again: ");
					continue;
				} else if (userInput == randomNumber) { // valid, check if matched/correct
					System.out.println("You win!");
					System.out.println("The number to guess was: " + randomNumber);
					return; // End the game if the player wins
				} else { // incorrect
					guessCount++;

					if (userInput < randomNumber) {
						System.out.println("Please pick a higher number");
					} else if (userInput > randomNumber) {
						System.out.println("Please pick a lower number");
					}
				}
			}
			// The player has used all of their guesses, so the game is over
			System.out.println("You lose!");
			System.out.println("The number to guess was: " + randomNumber);
		}
	}
}
