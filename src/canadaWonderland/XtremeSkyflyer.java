package canadaWonderland;

public class XtremeSkyflyer extends Ride {

	public XtremeSkyflyer(double height, int age) {
		super(height, age);

	}

	@Override
	public boolean admission(int age) {
		var isOldEnough = age > 15 && age < 50 ? true : false;
		return isOldEnough;
	}

}
