package cruiseCompany;

import java.util.Scanner;

public class LoginCredentials {
	Scanner sc = new Scanner(System.in);
	UserProfile[] userProfile1 = new UserProfile[10];
	UserProfile[] loggedInAccount = new UserProfile[1];
	private boolean isValid = false;
	public static int count = 0;

	public boolean signUpApplication() {
		System.out.println(
				"-------------------------------------------------------------------------------------------------");
		System.out.println(
				"Please sign up to book a cruise\n Enter 1 if you already have an account\n Enter 2 to sign up\n");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			loginPage();
			break;
		case 2:
			System.out.println(
					"----------------------------------------------------------------------------------------------");
			System.out.println("REGISTRATION PAGE");
			System.out.println("Enter your user name ");
			var userName = sc.next();
			System.out.println("Enter the password that you want to use ");
			String password = sc.next();
			System.out.println("Enter your Name ");
			String fullName = sc.next();
			System.out.println("Enter your Email Adress ");
			String email = sc.next();
			System.out.println("Enter your phone number");
			int phoneNumber = sc.nextInt();
			UserProfile profile2 = new UserProfile(userName, password, fullName, email,phoneNumber);
			registerUser(profile2);
			System.out.println("Thank you for registering!!!");
			System.out.println("Please log in to continue using the application!!!");
			loginPage();
			break;
		default:
			System.out.println("Invalid choice!!! Please try again");
			signUpApplication();
		}
		return isValid;
	}

	public boolean loginPage() {
		System.out.println(
				"---------------------------------------------------------------------------------------------");
		System.out.println("LOGIN USER");
		var loginAttempt = 3;
		String enteredUserName;
		String enteredPassword;

		while (loginAttempt != 0) {
			System.out.println("Enter your user name: ");
			enteredUserName = sc.next();
			System.out.println("Enter your Password: ");
			enteredPassword = sc.next();
			for (int i = 0; i < userProfile1.length; i++) {

				if (userProfile1[i].getUserName().equalsIgnoreCase(enteredUserName)
						&& (userProfile1[i].getPassword()).equals(enteredPassword)) {
					isValid = true;
					System.out.println(userProfile1[i].getFullName() + " is logged into the application");
					loggedInAccount[0] = userProfile1[i];
					return isValid;
				}
			}
			loginAttempt--;
			if (isValid == false && loginAttempt != 0) {
				System.out.println("Incorrect User id or password!!!");
			} else {
				System.out.println("Too many incorrect login attempts!!!");
				System.out.println("Do you want to try with a differnt id(y/n): ");
				var option = sc.next();
				if (option.equals("y")) {
					loginPage();
				}
			}
		}
		return isValid;
	}

	public void registerUser(UserProfile user) {
		for (int i = 0; i < count; i++) {
			if (user.getUserName().equalsIgnoreCase(userProfile1[i].getUserName())) {
				System.out.println("The Username " + user.getUserName() + " is Already Registered.");
				return;
			}
		}

		if (count <= 50) {
			userProfile1[count] = user;
			count++;
		}
	}

	public void updateDetails() {
		System.out.println("Please enter the information you want to change: \n1.Password \n 2.Phone Number\n");
		var choice = sc.nextInt();
		System.out.println("Please enter the user name and password before continue");
		System.out.println("Enter User name:");
		var enteredUserName = sc.next();
		System.out.println("Enter password: ");
		var enteredPassword = sc.next();
		switch (choice) {
		case 1:
			changeUserDetails(enteredUserName, enteredPassword);
			break;
		case 2:
			System.out.println("Enter your new phone number: ");
			var phoneNumber = sc.nextInt();
			changeUserDetails(enteredUserName, enteredPassword, phoneNumber);
			break;
		default:
			System.out.println("Invalid choice!!!");
			break;
		}
	}

	public void changeUserDetails(String enteredUserName, String enteredPassword) {
		var count = 0;
		for (int i = 0; i < userProfile1.length; i++) {
			if (userProfile1[i].getUserName().equalsIgnoreCase(enteredUserName)
					&& (userProfile1[i].getPassword()).equals(enteredPassword)) {
				System.out.println("Enter your new password: ");
				String password = sc.next();
				userProfile1[i].setPassword(password);
				System.out.println("Your password has been changed!");
				count = 1;
				break;
			}
		}
		if (count == 0) {
			System.out.println("Invalid user name and password!");
		}

	}

	public void changeUserDetails(String enteredUserName, String enteredPassword, int phoneNumber) {
		var count = 0;
		for (int i = 0; i < userProfile1.length; i++) {
			if (userProfile1[i].getUserName().equalsIgnoreCase(enteredUserName)
					&& (userProfile1[i].getPassword()).equals(enteredPassword)) {
				userProfile1[i].setPhoneNumber(phoneNumber);
				System.out.println("Your phone number has been updated!");
				count = 1;
				break;
			}
		}
		if (count == 0) {
			System.out.println("Invalid user name and password!");
		}

	}

}
