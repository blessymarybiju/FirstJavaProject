package waterTank;

public class WaterTankCapacity {

	double capacity;
	double bucket;

	void fillTheTank() {
		System.out.println("Current water level in the tank(in liters) : " + capacity);
		while (capacity <= 100) {
			if (capacity < 100) {
				capacity += bucket;
			} else {
				System.out.println("Tank is Full!!!");
				break;
			}
		}
		System.out.println("Current water level in the tank(in liters) after filling: " + capacity);
	}

}
