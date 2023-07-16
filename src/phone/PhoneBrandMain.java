package phone;

import java.util.Scanner;

public class PhoneBrandMain {

	public static void main(String[] args) {
		PhoneBrand pd=new PhoneBrand();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the brand name to see the products(samsung, apple, google):");
		pd.brandName=sc.next();
		pd.productsOfBrand();
		sc.close();

	}

}
