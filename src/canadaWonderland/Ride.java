package canadaWonderland;

import java.util.Scanner;

public class Ride {
	Scanner sc = new Scanner(System.in);
	public double height;
	public int age;

	public Ride(double height, int age) {
		this.height = height;
		this.age = age;
	}

	public enum RideType {
		ROLLOR_COASTER("Rollar Coaster"), 
		WATER_RIDE("Water ride"), 
		SKYCOASTER("Skycoaster");

		String typeOfTheRide;

		private RideType(String typeOfRide) {
			typeOfTheRide = typeOfRide;
		}

		String getTypeOfRide() {
			return typeOfTheRide;
		}
	}

	public boolean admission(double height) {
		boolean isTallEnough;
		if (height > 120) {
			System.out.println("You pass the height requirement!!!");
			isTallEnough = true;
		} else {
			System.out.println("You did not pass the height requirement!!!");
			isTallEnough = false;
		}
		return isTallEnough;
	}

	public boolean admission(int age) {
		var isOldEnough = age > 3 ? true : false;
		return isOldEnough;
	}

	public void requirementSatisfy(boolean isTallEnough, boolean isOldEnough) {
		if (isTallEnough && isOldEnough) {
			System.out.println("Enjoy your ride!!!");
		} else
			System.out.println("You didn't meet the minimum requirement");
	}

	public void accessRide(double height, int age) {
		System.out.println(
				"Select the ride you like to access:\n\t 1. Lazy River\n\t 2. Leviathan\n\t 3. Sling Shot\n\t 4. Xtreme SkyFlyer\n\t 5. Yukon Striker\n");
		var choice = sc.nextInt();
		switch (choice) {
		case 1:
			LazyRiver river = new LazyRiver(height, age);
			var isTallEnough = river.admission(height);
			var isOldEnough = river.admission(age);
			requirementSatisfy(isTallEnough, isOldEnough);
			break;
		case 2:
			Leviathan leviathan = new Leviathan(height, age);
			isTallEnough = leviathan.admission(height);
			isOldEnough = leviathan.admission(age);
			requirementSatisfy(isTallEnough, isOldEnough);
			break;
		case 3:
			SlingShot slingShot = new SlingShot(height, age);
			isTallEnough = slingShot.admission(height);
			isOldEnough = slingShot.admission(age);
			requirementSatisfy(isTallEnough, isOldEnough);
			break;
		case 4:
			XtremeSkyflyer xtremeSkyflyer = new XtremeSkyflyer(height, age);
			isTallEnough = xtremeSkyflyer.admission(height);
			isOldEnough = xtremeSkyflyer.admission(age);
			requirementSatisfy(isTallEnough, isOldEnough);
			break;
		case 5:
			YukonStriker yukonStriker = new YukonStriker(height, age);
			isTallEnough = yukonStriker.admission(height);
			isOldEnough = yukonStriker.admission(age);
			requirementSatisfy(isTallEnough, isOldEnough);
			break;
		default:
			System.out.println("Invalid choice!!!");
			break;

		}

	}

}
