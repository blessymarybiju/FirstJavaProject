package libraryManagement;

import java.util.Scanner;

public class Students {
	Scanner sc = new Scanner(System.in);
	String choice;
	Student studentNumber1 = new Student("Blessy", "21", "password");
	Student studentNumber2 = new Student("Ammu", "22", "password");
	Student studentNumber3 = new Student("Derry", "23", "password");

	Student theStudents[] = { studentNumber1, studentNumber2, studentNumber3 };
	Student[] loggedInAccount = new Student[1];
// Method to view all registered students
	public void showAllStudents() {
		System.out.println("Name\t\tRegister Number");
		for (int i = 0; i < theStudents.length; i++) {

			System.out.println(theStudents[i].studentName + "\t\t" + theStudents[i].registerNumber);
		}
	}
// Method that allow user to login
	boolean loginValidation() {
		var loginAttempt = 3;
		String enteredAccountNumber;
		String enteredPassword;
		var isValid = false;

		while (loginAttempt!=0) {
			System.out.println("Enter your register number: ");
			enteredAccountNumber = sc.next();
			System.out.println("Enter your Password: ");
			enteredPassword = sc.next();

			for (int i = 0; i < theStudents.length; i++) {

				if (theStudents[i].registerNumber.equalsIgnoreCase(enteredAccountNumber)
						&& (theStudents[i].password).equals(enteredPassword)) {
					isValid = true;
					System.out.println(theStudents[i].studentName + " is logged into the application");
					loggedInAccount[0] = theStudents[i];
					return isValid;
				}
			}
			loginAttempt--;
			if (isValid == false && loginAttempt !=0) {
				System.out.println("Incorrect User id or password!!!");
			} else {
				System.out.println("Too many incorrect login attempts!!!");
				System.out.println("Do you want to try with a differnt id(y/n): ");
				choice = sc.next();
				if (choice.equals("y")) {
					loginValidation();
				}
			}
		}
		return isValid;
	}

	public String logoutAccount() {
		System.out.println("You are logged out!!!");
		System.out.println("Do you want to login with a differnt user(y/n): ");
		choice = sc.next();
		if (choice.equals("y")) {
			loginValidation();
		}
		return null;
	}
}
