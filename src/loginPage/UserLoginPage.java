package loginPage;

import java.util.Scanner;

public class UserLoginPage {
	String userName;
	String password;
	String savedUsername = "pivotAdmin";
	String savedPassword = "Admin123";
	int chances = 1;
	Scanner sc = new Scanner(System.in);

	void checkingLoginIdAndPassword() {
		while (chances <= 3) {
		
			System.out.println("Enter your login id: ");
			userName = sc.next();
			System.out.println("Enter your password: ");
			password = sc.next();
			if (chances <= 3) {
				if (userName.equals(savedUsername) && password.equals(savedPassword)) {
					System.out.println("You are logged in to the application");
					break;
				} else {
					if (chances == 3) {
						System.out.println("Account locked");
						break;
					}
					System.out.println("Incorrect User id or password. Try again");

				}
			}

			chances++;

		}
	}
	

}
