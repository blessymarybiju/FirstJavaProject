package cruiseCompany;

import java.util.Scanner;

public class CruiseHotelRunner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CruiseDetails details = new CruiseDetails();
		LoginCredentials credentials = new LoginCredentials();
		HotelDetails hotelDetails = new HotelDetails();
		var isValidUser = false;
		String choice, option1, choice1;
		System.out.println("Welcome to Hotel/ Cruise Booking\n");
		do {
			isValidUser = credentials.signUpApplication();
			if (isValidUser) {
				do {
					System.out.println("Please enter the service you want to book Hotel Stay/ Cruise: ");
					choice = sc.next().toLowerCase();
					switch (choice) {
					case "hotel":
						hotelDetails.displayStayDetails();
						break;
					case "cruise":
						details.displayCruisePackage();
						break;
					default:
						System.out.println("Invalid choice!!!");
						break;
					}
					System.out.println("Do you want to book another Hotel Room or Cruise");
					option1 = sc.next().toLowerCase();
				} while (option1.equals("yes"));
				System.out.println("\nDo you want to change your personal information. Press Y to change.");
				var option = sc.next();
				if (option.equalsIgnoreCase("Y")) {
					credentials.updateDetails();
				}
			}
			System.out.println("Please enter logout to logout from the application (Press any other alphabet to exit)");
			choice1 = sc.next();
			if (choice1.equals("logout")) {
				System.out.println("You are logged out of the application!!");
			} else
				System.exit(0);

		} while (choice1.equals("logout"));

		System.out.println("Thank you for using the service!");
		sc.close();
	}

}
