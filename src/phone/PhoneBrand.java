package phone;

import java.util.Scanner;

public class PhoneBrand {

	String[] samsung = { "s20", "s21", "Flip3", "Fold3" };
	String[] google = { "GooglePixel6", "GooglePixel6Pro", "GooglePixelPro", "GooglePixel5" };
	String[] apple = { "Iphone12", "Iphone12 mini", "Iphone11", "Iphone13" };
	String brandName;

	Scanner sc = new Scanner(System.in);

	void productsOfBrand() {
		String productName;
		int nameIsPresent = 0;
		String tryAgain;

		if (brandName.equals("samsung")) {
			System.out.println("The products of Samsung are: ");
			for (int i = 0; i < samsung.length; i++) {
				System.out.println(samsung[i]);
			}
			System.out.println("Enter a product name you wish to select:");
			productName = sc.next();
			for (int i = 0; i < samsung.length; i++) {
				if (productName.equals(samsung[i])) {
					nameIsPresent = 1;
				}

			}
			if (nameIsPresent == 1) {
				System.out.println("Product selected is :  " + productName);

			} else {
				System.out.println("Please select a product from the list");
				System.out.println("Do you wish to enter again(y/n):");
				tryAgain = sc.next();
				if (tryAgain.equals("y")) {
					productsOfBrand();
				}
			}

		}

		else if (brandName.equals("google")) {
			System.out.println("The products of Google are: ");
			for (int i = 0; i < google.length; i++) {
				System.out.println(google[i]);
			}
			System.out.println("Enter a product name you wish to select:");
			productName = sc.next();
			for (int i = 0; i < google.length; i++) {
				if (productName.equals(google[i])) {
					nameIsPresent = 1;
				}

			}
			if (nameIsPresent == 1) {
				System.out.println("Product selected is :  " + productName);

			} else {
				System.out.println("Please select a product from the list");
				System.out.println("Do you wish to enter again(y/n):");
				tryAgain = sc.next();
				if (tryAgain.equals("y")) {
					productsOfBrand();
				}
			}
		}

		else if (brandName.equals("apple")) {
			System.out.println("The products of Apple are: ");
			for (int i = 0; i < apple.length; i++) {
				System.out.println(apple[i]);
			}
			System.out.println("Enter a product name you wish to select:");
			productName = sc.next();
			for (int i = 0; i < apple.length; i++) {
				if (productName.equals(apple[i])) {
					nameIsPresent = 1;
				}

			}
			if (nameIsPresent == 1) {
				System.out.println("Product selected is :  " + productName);

			} else {
				System.out.println("Please select a product from the list");
				System.out.println("Do you wish to enter again(y/n):");
				tryAgain = sc.next();
				if (tryAgain.equals("y")) {
					productsOfBrand();
				}
			}
		} else {
			System.out.println("Please enter a valid brand name!!!");
		}

	}

}
