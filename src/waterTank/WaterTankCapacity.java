package waterTank;

public class WaterTankCapacity {

	double capacity;
	double bucket;
	double totalCapacity;
	double maxCapacity;

	void fillTheTank() {
		while (capacity <= totalCapacity) {
			if (capacity <= maxCapacity) {
				System.out.println("Current water level in the tank(in liters) : " + capacity);
				capacity += bucket;
			} else {
				System.out.println("Maximum capacity of tank is "+maxCapacity+" liters(out of "+ totalCapacity+"). Tank is almost Full!!! ");
				break;
			}
		}

	}

}
