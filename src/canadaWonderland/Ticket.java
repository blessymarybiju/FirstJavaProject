package canadaWonderland;

import java.util.Scanner;

public class Ticket {
	Scanner sc = new Scanner(System.in);

	public void getTicket(int noOfTicket) {
		System.out
				.println("Please select the pass you like to purchase \n1. Daily Pass \n2.Season Pass \n3. Gold Pass");
		var choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println(noOfTicket + " daily Pass is added to the cart");
			break;
		case 2:
			System.out.println(noOfTicket + " season Pass is added to the cart");
			break;
		case 3:
			System.out.println(noOfTicket + " gold Pass is added to the cart");
			break;
		}
	}

}
