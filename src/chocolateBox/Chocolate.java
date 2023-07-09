package chocolateBox;

public class Chocolate {

	int noOfChocolates;

	void addingChocolatesToBox() {
		System.out.println("Number of chocolates in the box before filling: " + noOfChocolates);
		while (noOfChocolates <= 63) {
			if (noOfChocolates >= 62) {
				break;
			}
			noOfChocolates += 5;

		}
		System.out.println("Number of chocolates in the box after filling: " + noOfChocolates);
	}

}
