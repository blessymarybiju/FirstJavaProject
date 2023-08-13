package canadaWonderland;

import java.util.Scanner;

public class Wonderland {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String option;
		Ticket ticket = new Ticket();
		System.out.println("WELCOME TO CANADA WONDERLAND\n");
		do {
			System.out.println("Please select\n\t 1.Purchase a ticket\n\t 2.Access rides ");
			var choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("\nEnter how many ticket you would like to purchase: ");
				var noOfTicket = sc.nextInt();
				ticket.getTicket(noOfTicket);
				break;
			case 2:
				System.out.println("\nPlease enter your height: ");
				var height = sc.nextDouble();
				System.out.println("Enter your age: ");
				var age = sc.nextInt();
				Ride ride = new Ride(height, age);
				ride.accessRide(height, age);
				break;
			default:
				System.out.println("Invalid option!!!");
				break;
			}
			System.out.println("\nDo you want to use application again(y for yes/ n for no):");
			option = sc.next();
		} while (option.equalsIgnoreCase("y"));
		sc.close();
	}

}
