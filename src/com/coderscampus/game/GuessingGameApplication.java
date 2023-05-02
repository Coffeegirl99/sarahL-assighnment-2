package com.coderscampus.game;

import java.util.Random;
import java.util.Scanner;

public class GuessingGameApplication {

	public static void main(String[] args) {

		Random random = new Random();
		int randomNumber = random.nextInt(100);

		System.out.println("Pick a number between 1 and 100");

		Scanner scanner = new Scanner(System.in);
		Integer userInput = scanner.nextInt();

		while (userInput < 1 || userInput > 100) {
			System.out.println("Your guess is not between 1 and 100, please try again");
			userInput = scanner.nextInt();
		}

		for (int guessCount = 1; guessCount <= 4; guessCount++) {

			if (userInput == randomNumber) {
				System.out.println("You win!");
				System.out.println("The number to guess was: " + randomNumber);
				return;
			}
			if (userInput < randomNumber) {
				System.out.println("Please pick a higher number");
				userInput = scanner.nextInt();
			}
			if (userInput > randomNumber) {
				System.out.println("Please pick a lower number");
				userInput = scanner.nextInt();

			}

		}
		while (userInput < 1 || userInput > 100) {
			System.out.println("Your guess is not between 1 and 100, please try again");
			userInput = scanner.nextInt();
		}
		System.out.println("You lose!");
		System.out.println("The number to guess was: " + randomNumber);
	}
}
