package cruiseCompany;

import java.util.Scanner;

public class DiscoveryCruise extends Cruise implements CruiseCompany {
	private double adultTicketPrice = 39.99, kidTicketPrice = 9.99, total = 0;
	Scanner sc = new Scanner(System.in);
	CruiseDetails details = new CruiseDetails();
	private double adultBuffet = 20.99, kidBuffet = 4.99, hst, finalPrice, adultBuffetPrice = 0, kidBuffetPrice = 0;
	private int numOfDays = 4, adventureGameRate = 50, spot = 0;
	String option1;

	public DiscoveryCruise(String cruiseName, String departurePort, String destination, String returnPort) {
		super(cruiseName, departurePort, destination, returnPort);

	}

	@Override
	public double getAdultTicketPrice() {
		return adultTicketPrice;
	}

	@Override
	public double getKidTicketPrice() {
		return kidTicketPrice;
	}

	@Override
	public double calculateCruisePrice(int numOfAdult, int childrenAbove5) {
		System.out.println("All our cruises have food service on board. Do you want to pre-book for dinner buffet meals"
				+ " at 20.99 per day for adults and 4.99 per day for kids?(enter yes to pre-book");
		var choice = sc.next().toLowerCase();
		System.out.println(
				"Do you like to prebook for adventure Game at a pre-booking rate of $50/ person(enter yes to pre-book): ");
		var option = sc.next().toLowerCase();
		adventureGameRate = option.equals("yes") ? 50 : 0;
		do {
			System.out.println("How many spots you like to book: ");
			spot = sc.nextInt();
			if (spot > (numOfAdult + childrenAbove5)) {
				System.out.println("The number of ticket you booked was " + (numOfAdult + childrenAbove5)
						+ ", but you entered " + spot
						+ "spots. Do you want to continue with the pre-booking(enter yes to continue, no to re enter):");
				option1 = sc.next().toLowerCase();
				if (option1.equals("yes")) {
					adventureGameRate = adventureGameRate * spot;
				}
			} else {
				adventureGameRate = adventureGameRate * spot;
				option1 = "yes";
			}
		} while (!option1.equals("yes"));
		System.out.println("Your Package includes ");
		double adultTicket = adultTicketPrice * numOfAdult * numOfDays;
		System.out.println("Discovery Cruise Adults\t\t\t @" + numOfAdult + "\t: $" + adultTicket);
		double kidTicket = kidTicketPrice * childrenAbove5 * numOfDays;
		System.out.println("Discovery Cruise Children Above 5\t \t @" + childrenAbove5 + "\t: $" + kidTicket);
		if (choice.equals("yes")) {
			adultBuffetPrice = adultBuffet * numOfAdult * numOfDays;
			System.out.println("Buffet Special Price Adults\t\t @" + numOfAdult + " \t: $" + adultBuffetPrice);
			kidBuffetPrice = kidBuffet * childrenAbove5 * numOfDays;
			System.out
					.println("Buffet Special Price Children above 5\t @" + childrenAbove5 + " \t: $" + kidBuffetPrice);
		}
		if (spot != 0) {
			System.out.println("Discovery Cruise adventure Games\t\t @" + spot + "\t: $" + adventureGameRate);
		}

		total = adultBuffetPrice + adultTicket + kidTicket + kidBuffetPrice;
		System.out.println("Total Price\t\t\t\t\t: $" + total);
		hst = total * 0.15;
		finalPrice = total + hst;
		System.out.println("HST @ 15%\t\t\t\t\t: $" + hst);
		System.out.println("Final Price\t\t\t\t\t: $" + finalPrice);
		return finalPrice;
	}

}
