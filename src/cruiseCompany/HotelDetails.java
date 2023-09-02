package cruiseCompany;

import java.util.Scanner;

public class HotelDetails {
	Scanner sc = new Scanner(System.in);
	HotelStay hotel;

	public void displayStayDetails() {
		System.out.println(
				"-------------------------------------------------------------------------------------------------\n\n");
		System.out.println("Welcome to Hotel Booking\n");
		System.out.println("Please enter the room you want to select\r\n"
				+ "Delux Suite: accommodates 2 adults and 2 children at the rate of $180/ night\r\n"
				+ "Family Suite: accommodates 4 adults and 4 children at $230/ night");
		String selectPackage = sc.nextLine().toLowerCase();
		switch (selectPackage) {
		case "delux":
			hotel = new DeluxSuite(selectPackage);
			calculatePrice(hotel);
			break;
		case "family":
			hotel = new FamilySuite(selectPackage);
			calculatePrice(hotel);
			break;
		default:
			System.out.println("Invalid room type!!!");
			break;
		}
	}

	public void calculatePrice(HotelStay hotel) {
		System.out.println("Enter the number of adults: ");
		int numOfAdult = sc.nextInt();
		System.out.println("Enter the number of children: ");
		int numOfKid = sc.nextInt();
		hotel.calculateTotal(numOfAdult, numOfKid);
	}
}
