package cruiseCompany;

import java.util.Scanner;

public class FamilySuite extends Hotel implements HotelStay {
	Scanner sc = new Scanner(System.in);
	private int adultLunchRate = 25, kidLunchRate = 5, adultLunchTotal = 0, kidsLunchTotal = 0, daysOfStay;
	private double roomRate = 180, total, hst, finalAmount, hstpercentage=0.18;

	FamilySuite(String roomType) {
		super(roomType);
	}
	public void calculateTotal(int numOfAdult, int numOfKid) {

		System.out.println(
				"All rooms come with free breakfast. Do you want to add lunch in your room as well at a discounted pre-booking rate of $25/ adult and $5/ child.(Enter yes to pre-book):");
		var choice = sc.next();
		System.out.println("Enter the number of days of stay: ");
		daysOfStay = sc.nextInt();
		System.out.println("\n\nThe total amount you will be charged is ");
		System.out.println("Family Suite \t\t@ " + daysOfStay + "nights \t:" + (roomRate * daysOfStay));
		if (choice.equals("yes")) {
			adultLunchTotal = numOfAdult * adultLunchRate;
			kidsLunchTotal = numOfKid * kidLunchRate;
			System.out.println("Lunch Pre-Booked Special Rate Adults @ " + numOfAdult + " :" + adultLunchTotal);
			System.out.println("Lunch Pre-Booked Special Rate Children @ " + numOfKid + " :" + kidsLunchTotal);
		}
		total=(roomRate * daysOfStay)+adultLunchTotal+kidsLunchTotal;
		System.out.println("Total Price\t\t\t\t\t: $" + total);
		hst = total * hstpercentage;
		finalAmount = total + hst;
		System.out.println("HST @ 18%\t\t\t\t\t: $" + hst);
		System.out.println("Final Price\t\t\t\t\t: $" + finalAmount);

	
	}
}
