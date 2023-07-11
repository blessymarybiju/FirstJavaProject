package waterTank;

public class WaterTankMain {

	public static void main(String[] args) {
		WaterTankCapacity wtc = new WaterTankCapacity();
		//test
		wtc.capacity = 0.0;
		wtc.bucket = 10.00;
		wtc.maxCapacity=95.00;
		wtc.totalCapacity=100.0;
		wtc.fillTheTank();

	}

}
