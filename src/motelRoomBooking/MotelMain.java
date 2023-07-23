package motelRoomBooking;

import java.util.Scanner;

public class MotelMain {
	public static void main(String[] args) {
		Room roomBasic = new Room("Basic", true, 100);
		Room roomDeluxe = new Room("Deluxe", true, 200);
		Room roomLuxury = new Room("Luxury", true, 300);

		Room[] allRoomsOfBlossom = { roomBasic, roomDeluxe, roomLuxury };
		Motel blossom = new Motel("Blossom", 5, allRoomsOfBlossom);

		Room roomCBasic = new Room("Basic", true, 100);
		Room roomCDeluxe = new Room("Deluxe", true, 200);
		Room roomCLuxury = new Room("Luxury", true, 300);

		Room[] allRoomsOfCherry = { roomCBasic, roomCDeluxe, roomCLuxury };
		Motel cherry = new Motel("Cherry", 5, allRoomsOfCherry);

		Motel[] allMotels = { blossom, cherry };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the motel you wanna book (Cherry/Blossom): ");
		String motelBook = sc.next();
		for (int i = 0; i < allMotels.length; i++) {
			if (motelBook.equals(allMotels[i].nameOfMotel)) {
				System.out.println("Motel is available, Please choose the room type you want to book:");
				String roomType = sc.next();
				for (int j = 0; j < allMotels[i].room.length; j++) {
					if (allMotels[i].room[j].type.equals(roomType) && allMotels[i].room[j].isAvialable) {
						System.out.println("Room can be booked!!!");
						System.out.println("Enter your name: ");
						String nameOfCustomer = sc.next();
						System.out.println("Enter your ID number: ");
						String id = sc.next();
						GuestDetails details = new GuestDetails(nameOfCustomer, id, allMotels[i].room[j]);
						System.out.println("The room " + roomType +" in "+motelBook+ " motel has been assigned to " + details.nameOfGuest);
						break;
					}
				}
			}
		}
		sc.close();
	}

}
