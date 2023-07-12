package waterTank;

public class WaterTankMain {

	public static void main(String[] args) {
		WaterTankCapacity wtc = new WaterTankCapacity();
		wtc.initialWaterLevel = 2.0;
		wtc.bucketCapacity = 10.00;
		wtc.totalCapacity=100.0;
		wtc.maxCapacity=wtc.totalCapacity-5.00;
		wtc.fillTheTank();

	}

}
