package chocolateBox;

public class Chocolate {

	int noOfChocolates;
	int maxNumberOfChocolates;
	int chocolateCount;

	void addChocolatesToBox() {
		System.out.println("Number of chocolates in the box before filling: " + noOfChocolates);
		while (noOfChocolates <= maxNumberOfChocolates) {
			if (noOfChocolates >= maxNumberOfChocolates) {
				break;
			}
			System.out.println("Number of chocolates in the box: " + noOfChocolates);
			noOfChocolates += chocolateCount;

		}
		System.out.println("Can't add another " + chocolateCount
				+ " chocolates to the box. Maximum chocolates fit in the box is " + maxNumberOfChocolates);
	}

}
