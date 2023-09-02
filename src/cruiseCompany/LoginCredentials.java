package cruiseCompany;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginCredentials {
	Scanner sc = new Scanner(System.in);
	private boolean isValid = false;
	public static int count = 0;
	UserProfile[] loggedInAccount = new UserProfile[1];
	UserProfile[] userProfile1 = new UserProfile[10];

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
			boolean isValid = isValidPassword(password);
			while (!isValid) {
				System.out.println(
						"Password you entered doesn't satisfy the criteria.\n It contains at least 4 characters and at most 10 characters.\r\n"
								+ "It contains at least one digit.\r\n"
								+ "It contains at least one upper case alphabet.\r\n"
								+ "It contains at least one lower case alphabet.\r\n"
								+ "It contains at least one special character which includes !@#$%&*()-+=^.\r\n"
								+ "It doesn’t contain any white space.\r\n");
				System.out.println("Please enter the password that you want to use");
				password = sc.next();
				isValid = isValidPassword(password);
			}
			System.out.println("Enter your Name ");
			String fullName = sc.next();
			System.out.println("Enter your Email Adress ");
			String email = sc.next();
			boolean isEmailValid = isValidEmail(email);
			while (!isEmailValid) {
				System.out.println(
						"Email you entered didn't satisfy the criteria. It contains a local part, the at-sign (@), and a domain name(ex:abc@gmail.com): ");
				System.out.println("Enter your Email Adress ");
				email = sc.next();
				isEmailValid = isValidEmail(email);

			}
			System.out.println("Enter your phone number");
			int phoneNumber = sc.nextInt();
			UserProfile profile2 = new UserProfile(userName, password, fullName, email, phoneNumber);
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
			if (userProfile1[0] == null) {
				System.out.println("No user found!!!\nPlease register to continue: ");
				signUpApplication();
				break;
			} else {
				try {
					for (int i = 0; i < userProfile1.length; i++) {

						if (userProfile1[i].getUserName().equalsIgnoreCase(enteredUserName)
								&& (userProfile1[i].getPassword()).equals(enteredPassword)) {
							isValid = true;
							System.out.println(userProfile1[i].getFullName() + " is logged into the application");
							loggedInAccount[0] = userProfile1[i];
							return isValid;
						}
					}
				} catch (NullPointerException e) {
					System.out.println("User profile is not found");
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

	public static boolean isValidPassword(String password) {
		String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{4,10}$";
		Pattern p = Pattern.compile(regex);
		if (password == null) {
			return false;
		}
		Matcher m = p.matcher(password);
		return m.matches();
	}

	public static boolean isValidEmail(String email) {
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,10}$";
		Pattern pat = Pattern.compile(emailRegex);
		if (email == null)
			return false;
		return pat.matcher(email).matches();
	}
}
