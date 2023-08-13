package canadaWonderland;

public class Leviathan extends Ride {

	public Leviathan(double height, int age) {
		super(height, age);
	}

	@Override
	public boolean admission(int age) {
		var isOldEnough = age > 3 && age < 55 ? true : false;
		return isOldEnough;
	}

}
