package randomNamePickingGame;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNamePicker {
	Scanner sc = new Scanner(System.in);
	int attemptsLeft = 5;
	int index = 0;

	String randomNameGenerator(String[] names) {
		Random generator = new Random();
		int randomIndex = generator.nextInt(names.length);
		String randomNamePicked = names[randomIndex].toLowerCase();
		return randomNamePicked;
	}

	void guessName(char[] maskedNameArray, char[] nameArray, char[] tempArray) {
		while (attemptsLeft > 0) {
			var count = 0;
			if (Arrays.equals(tempArray, maskedNameArray)) {
				System.out.println("\n Congrations!!! You won the game");
				break;
			}
			System.out.println("\nGuess the a letter of the name picked(in lower case): ");
			char letter = sc.next().charAt(index);
			for (int i = 0; i < nameArray.length; i++) {
				if ((nameArray[i]) == letter) {
					maskedNameArray[i] = nameArray[i];
					nameArray[i] = 1;
					count = 1;
					break;
				}
			}
			if (count == 0) {
				System.out.println("Try again!!!");
				attemptsLeft--;
				System.out.println("Attempts left to try: " + attemptsLeft + "\n");
			}
			System.out.println(maskedNameArray);
			if (attemptsLeft == 0) {
				System.out.println("Maximum attempts reached...");
			}
		}
	}
}
