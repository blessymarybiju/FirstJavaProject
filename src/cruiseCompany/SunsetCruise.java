package cruiseCompany;

import java.util.Scanner;

public class SunsetCruise extends Cruise implements CruiseCompany {
	Scanner sc = new Scanner(System.in);
	private double adultTicketPrice = 52.99, kidTicketPrice = 15.99, total = 0;
	CruiseDetails details = new CruiseDetails();
	private double adultBuffet = 20.99, kidBuffet = 4.99, hst, finalPrice, adultBuffetPrice = 0, kidBuffetPrice = 0,
			hstpercentage = 0.15;
	private int numOfDays = 1, candleLightDinnerRate = 45, spot;
	private String option1;

	public SunsetCruise(String cruiseName, String departurePort, String destination, String returnPort) {
		super(cruiseName, departurePort, destination, returnPort);
	}

	public double getAdultTicketPrice() {
		return adultTicketPrice;
	}

	public double getKidTicketPrice() {
		return kidTicketPrice;
	}

	@Override
	public double calculateCruisePrice(int numOfAdult, int childrenAbove5) {
		if (childrenAbove5 == 0) {
			kidBuffet = 0;
		}
		if (numOfAdult == 0) {
			adultBuffet = 0;
		}
		System.out.println("All our cruises have food service on board. Do you want to pre-book for dinner buffet meals"
				+ " at 20.99 per day for adults and 4.99 per day for kids?(enter yes to pre-book");
		var choice = sc.next().toLowerCase();
		System.out.println(
				"Do you like to prebook for candle Light Dinner at a pre-booking rate of $45/ person(enter yes to pre-book): ");
		var option = sc.next().toLowerCase();
		candleLightDinnerRate = option.equals("yes") ? 50 : 0;
		if (option.equals("yes")) {
			do {
				System.out.println("How many spots you like to reserve: ");
				spot = sc.nextInt();
				if (spot > (numOfAdult + childrenAbove5)) {
					System.out.println("The number of ticket you booked was " + (numOfAdult + childrenAbove5)
							+ ", but you entered " + spot
							+ "spots. Do you want to continue with the pre-booking(enter yes to continue, no to re enter):");
					option1 = sc.next().toLowerCase();
					if (option1.equals("yes")) {
						candleLightDinnerRate = candleLightDinnerRate * spot;
					}
				} else {
					candleLightDinnerRate = candleLightDinnerRate * spot;
					option1 = "yes";
				}
			} while (!option1.equals("yes"));
		}
		System.out.println("Your Package includes ");
		double adultTicket = adultTicketPrice * numOfAdult * numOfDays;
		System.out.println("Sunset Cruise Adults\t\t\t @" + numOfAdult + "\t: $" + adultTicket);
		double kidTicket = kidTicketPrice * childrenAbove5 * numOfDays;
		System.out.println("Sunset Cruise Children Above 5\t \t @" + childrenAbove5 + "\t: $" + kidTicket);

		if (choice.equals("yes")) {
			adultBuffetPrice = adultBuffet * numOfAdult * numOfDays;
			System.out.println("Buffet Special Price Adults\t\t @" + numOfAdult + " \t: $" + adultBuffetPrice);
			kidBuffetPrice = kidBuffet * childrenAbove5 * numOfDays;
			System.out
					.println("Buffet Special Price Children above 5\t @" + childrenAbove5 + " \t: $" + kidBuffetPrice);
		}
		if (spot != 0) {
			System.out.println("Sunset Cruise Adults candle Light Dinner@" + spot + "\t: $" + candleLightDinnerRate);
		}

		total = adultBuffetPrice + adultTicket + kidTicket + kidBuffetPrice + candleLightDinnerRate;
		System.out.println("Total Price\t\t\t\t\t: $" + total);
		hst = total * hstpercentage;
		finalPrice = total + hst;
		System.out.println("HST @ 15%\t\t\t\t\t: $" + hst);
		System.out.println("Final Price\t\t\t\t\t: $" + finalPrice);
		return finalPrice;
	}

}
