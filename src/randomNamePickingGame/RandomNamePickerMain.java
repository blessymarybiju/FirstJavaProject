package randomNamePickingGame;

import java.util.Scanner;

public class RandomNamePickerMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] names = { "Abishek", "Aman", "Amrinder", "Binu", "Blessy", "Geethu", "Manpreet", "Rajdeep", "Sandeep",
				"Surya", "Vaisnavi" };
		var choice = "y";
		System.out.println("Welcome to GUESS THE NAME Game");
		do {
			RandomNamePicker rnp = new RandomNamePicker();
			var randomNamePicked = rnp.randomNameGenerator(names);

			String maskedName = randomNamePicked.replaceAll("[A-Z,a-z]", "*");
			char[] maskedNameArray = maskedName.toCharArray();
			char[] nameArray = randomNamePicked.toCharArray();
			char[] tempArray = randomNamePicked.toCharArray();

			rnp.guessName(maskedNameArray, nameArray, tempArray);
			System.out.println("Do you want to play again(y for yes, n for no)?");
			choice = sc.next();
		} while (choice.equals("y"));
		System.out.println("Thanks for your time!!!");
		sc.close();
	}
}