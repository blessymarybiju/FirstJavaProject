package motelRoomBooking;

public class Motel {
	String nameOfMotel;
	int totalRooms;
	Room[] room;

	public Motel(String nMotel, int tRooms, Room[] rRoom) {
		nameOfMotel = nMotel;
		totalRooms = tRooms;
		room = rRoom;
	}

}
