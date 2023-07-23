package motelRoomBooking;

public class Room {
	String type;
	boolean isAvialable;
	double price;

	public Room(String roomType, boolean canBeBooked, double cost) {
		type = roomType;
		isAvialable = canBeBooked;
		price=cost;
	}

}
