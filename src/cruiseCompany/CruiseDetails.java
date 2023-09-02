package cruiseCompany;

import java.util.Scanner;

public class CruiseDetails {
	Scanner sc = new Scanner(System.in);
	public String returnPort, destination, dearturePort;
	CruiseCompany cruise;
	private int childrenAbove5 = 0, age, numOfAdult;

	public void displayCruisePackage() {
		System.out.println(
				"-------------------------------------------------------------------------------------------------\n\n");
		System.out.println("Welcome to Cruise Booking.\n");
		System.out.println(
				"We offer 4 different packages as displayed below. Please enter the cruise that you want to select:");
		System.out.println(
				"\tScenic Cruise(3 days) \n\tSunset Cruise(1 day) \n\tDiscovery Cruise(4 days) \n\tMystery Cruise(2 days)");
		String selectPackage = sc.nextLine().toLowerCase();
		switch (selectPackage) {
		case "scenic cruise":
			System.out.println("\nThe cruise that you have selected is Scenic Cruise which is a 3 day cruise");
			cruise = new ScenicCruise(selectPackage, "Toronto", "Miami", "Toronto");
			calculatePriceByAge(cruise);
			break;
		case "sunset cruise":
			System.out.println("\nThe cruise that you have selected is Sunset Cruise which is a 1 day cruise");
			cruise = new SunsetCruise(selectPackage, "The West pier", "Centre Island", "The West pier");
			calculatePriceByAge(cruise);
			break;
		case "discovery cruise":
			System.out.println("\nThe cruise that you have selected is Discovery Cruise which is a 4 day cruise");
			cruise = new DiscoveryCruise(selectPackage, "Vancouver", "Los Angeles", "Toronto");
			calculatePriceByAge(cruise);
			break;
		case "mystery cruise":
			System.out.println("\nThe cruise that you have selected is Mystery Cruise which is a 2 day cruise");
			cruise = new MysteryCruise(selectPackage, "Toronto", "NewYork", "Toronto");
			calculatePriceByAge(cruise);
			break;
		default:
			System.out.println("Invalid cruise name!!! Please try again");
			break;
		}

	}

	public void calculatePriceByAge(CruiseCompany cruise) {
		System.out.println("\nPrice for Adults (greater than 12) :" + cruise.getAdultTicketPrice());
		System.out.println("Price for kids above 5 :" + cruise.getKidTicketPrice());
		System.out.println(
				"\nPlease press Y if you want to continue with the selection or press any other alphabet to select another.");
		var option = sc.next();
		if (option.equals("y")) {
			System.out.println("Enter the number of adults: ");
			numOfAdult = sc.nextInt();
			System.out.println("Enter the number of children: ");
			int numOfKid = sc.nextInt();
			if (numOfKid != 0) {
				for (int i = 0; i < numOfKid; i++) {
					System.out.println("Enter the age of child " + (i + 1));
					age = sc.nextInt();
					if (age >= 5)
						childrenAbove5++;
				}
			}
		}
		cruise.calculateCruisePrice(numOfAdult, childrenAbove5);
	}

}
