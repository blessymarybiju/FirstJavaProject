package canadaWonderland;

public class YukonStriker extends Ride {

	public YukonStriker(double height, int age) {
		super(height, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean admission(int age) {
		var isOldEnough = age > 10 ? true : false;
		return isOldEnough;
	}

}
