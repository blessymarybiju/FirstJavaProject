package libraryManagement;

import java.util.Scanner;
import libraryManagement.Book.BookType;

public class Books {
	// Fiction Book
	Book theShining = new Book(11, "Stephen_King", "The_Shining", 2, BookType.FICTION);
	Book anneOfGreenGables = new Book(12, "Lucy_Maud_Montgomery", "Anne_of_Green_Gables", 1, BookType.FICTION);

	// Popular Books
	Book harryPotter = new Book(13, "JKRowling", "the_Prisoner_Of_Azkaban", 2, BookType.FAMOUS);
	Book famousFive = new Book(14, " EileenSoper", "Five_On_A_Treasure_Island", 3, BookType.FAMOUS);
	Book lordOfTheRings = new Book(15, "JR", "lord_Of_The_Rings", 1, BookType.FAMOUS);

	// Kids Book
	Book throughTheLookingGlass = new Book(16, "Lewis_Carroll", "Through_The_Looking_Glass", 1, BookType.KIDS);
	Book gulliversTravels = new Book(17, "Jonathan_Swift", "Gulliver's_Travels", 1, BookType.KIDS);
	Book robinsonCrusoe = new Book(18, "Daniel_Defoe", "Robinson_Crusoe", 1, BookType.KIDS);
	Book aroundTheWorldInEightyDays = new Book(19, "Jules_Verne", "Around_the_World_in_Eighty_Days", 1, BookType.KIDS);

	// Thriller Books
	Book goneGirl = new Book(20, "Gillian_Glynn", "Gone_Girl", 1, BookType.THRILLER);
	Book theGirlOnTheTrain = new Book(21, "Paula_Hawkins", "The_Girl_on_the_Train", 1, BookType.THRILLER);
	Book theGuestList = new Book(22, "Lucy_Foley", "The_Guest_List", 1, BookType.THRILLER);
	Book theSilentPatient = new Book(23, "AlexM", "The_Silent_Patient", 1, BookType.THRILLER);

	// Novel
	Book prideAndPrejudice = new Book(24, " Jane_Austen", "Pride_And_Prejudice", 1, BookType.NOVEL);
	Book theRedAndTheBlack = new Book(25, "Stendhal", "The_Red_and_the_Black", 1, BookType.NOVEL);

	Book theBooks[] = { theShining, anneOfGreenGables, harryPotter, famousFive, lordOfTheRings, throughTheLookingGlass,
			gulliversTravels, robinsonCrusoe, aroundTheWorldInEightyDays, goneGirl, theGirlOnTheTrain, theGuestList,
			theSilentPatient, prideAndPrejudice, theRedAndTheBlack };
	Scanner sc = new Scanner(System.in);

	String searchBook(String type) {

		var count = 0;
		for (int i = 0; i < theBooks.length; i++) {
			if (theBooks[i].typeOFBook.getTypeOfBook().equalsIgnoreCase(type)) {
				System.out.println("Serial number: " + theBooks[i].serialNo);
				System.out.println("Book Name: " + theBooks[i].bookName);
				System.out.println("Author Name: " + theBooks[i].authorName);
				System.out.println("Available Quantity: " + theBooks[i].bookQty);
				System.out.println("\n");
				count = 1;
			}
		}
		if (count == 0) {
			System.out.println("Please enter a valid type!!!");
		}
		return null;
	}

	// searchBook method using book name and author name
	String searchBook(String bookName, String authorName) {
		var count = 0;
		for (int i = 0; i < theBooks.length; i++) {
			if (theBooks[i].bookName.equals(bookName) && theBooks[i].authorName.equals(authorName)) {
				System.out.println("Serial number: " + theBooks[i].serialNo);
				System.out.println("Book Name: " + theBooks[i].bookName);
				System.out.println("Author Name: " + theBooks[i].authorName);
				System.out.println("Available Quantity: " + theBooks[i].bookQty);
				System.out.println("\n");
				count = 1;
			}
		}
		if (count == 0) {
			System.out.println("Please search for an available book in library!!!");
		}
		return null;
	}

	void showAllBooks() {
		for (int i = 0; i < theBooks.length; i++) {
			System.out.println("Serial number: " + theBooks[i].serialNo);
			System.out.println("Book Name: " + theBooks[i].bookName);
			System.out.println("Author Name: " + theBooks[i].authorName);
			System.out.println("Type: " + theBooks[i].typeOFBook);
			System.out.println("Available Quantity: " + theBooks[i].bookQty);
			System.out.println("\n");
		}
	}

	void displayMenu() {
		System.out.println("\nEnter 1 to Search a Book");
		System.out.println("Enter 2 to Search by author and book name");
		System.out.println("Enter 3 to Show All Books");
		System.out.println("Enter 4 to Show All Registered Students");
		System.out.println("Enter 5 to Borrow Book");
		System.out.println("Enter 0 to Exit Application");
	}

	int borrowBook(String bookName) {
		var count = 0;
		for (int i = 0; i < theBooks.length; i++) {
			if (theBooks[i].bookName.equals(bookName)) {
				if (theBooks[i].bookQty < theBooks[i].bookQtyCopy) {
					return -1;
				}
				theBooks[i].bookQty--;
				count++;
				System.out.println("Book added for checkout");
				return 1;
			}
		}
		if (count == 0) {
			System.out.println("Please enter a book available in library!!!");
		}
		return 0;
	}
}
