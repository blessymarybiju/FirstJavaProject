package motelRoomBooking;

public class GuestDetails {
	String nameOfGuest;
	String id;
	Room room;

	public GuestDetails(String nGuest, String identificationNo,Room rm) {
		nameOfGuest = nGuest;
		id = identificationNo;
		room=rm;
	}

}
