package waterTank;

public class WaterTankCapacity {

	double initialWaterLevel;
	double bucketCapacity;
	double totalCapacity;
	//maximum capacity of tank
	double maxCapacity;
	//maximum tank capacity to hold water

	void fillTheTank() {
		while (initialWaterLevel <= totalCapacity) {
			if (initialWaterLevel <= maxCapacity) {
				System.out.println("Current water level in the tank(in liters) : " + initialWaterLevel);
				if(initialWaterLevel>=maxCapacity || ((initialWaterLevel+bucketCapacity)>maxCapacity))
				{
					System.out.println("Maximum capacity of tank is "+maxCapacity+" liters(out of "+ totalCapacity+"). Can't add "+bucketCapacity+" liters. Tank is almost Full!!! ");
					break;
				}
				initialWaterLevel += bucketCapacity;
			} 
		}

	}

}
