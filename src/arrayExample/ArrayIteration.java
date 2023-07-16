package arrayExample;

import java.util.Scanner;

public class ArrayIteration {

	String[] names = new String[5];
	Scanner sc = new Scanner(System.in);

	void populateNameArray() {

		for (int i = 0; i < names.length; i++) {
			System.out.println("Enter name " + (i + 1) + " : ");
			names[i] = sc.next();
		}
	}

	// Find the entered name if present in the array
	void findNameInArray() {
		String enteredName;
		int countOfName = 0;
		System.out.println("Enter the name you want to search");
		enteredName = sc.next();
		for (int i = 0; i < names.length; i++) {
			if (enteredName.equals(names[i])) {
				countOfName++;
			}

		}
		if (countOfName >= 1) {
			System.out.println("The name "+enteredName + " is present in the array " + countOfName + " times.");

		} else
			System.out.println("The name "+enteredName + " is not present in the array");

	}

}
