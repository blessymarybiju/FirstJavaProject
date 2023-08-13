package canadaWonderland;

public class SlingShot extends Ride {

	public SlingShot(double height, int age) {
		super(height, age);
	}

	@Override
	public boolean admission(int age) {
		var isOldEnough = age > 15 ? true : false;
		return isOldEnough;
	}

}
