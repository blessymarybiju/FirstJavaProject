package libraryManagement;

import java.util.Scanner;

public class LibraryMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Books booksInLibrary = new Books();
		Students registeredStudents = new Students();
		int choice;

		do {
			booksInLibrary.displayMenu();
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				booksInLibrary.searchBook();
				break;
			case 2:
				booksInLibrary.showAllBooks();
				break;

			case 3:
				registeredStudents.showAllStudents();
				break;
			case 4:
				booksInLibrary.borrowBook();
				break;
			case 0:
				break;
			default:
				System.out.println("Please enter a valid option!!!");
			}
		} while (choice != 0);
		sc.close();
	}
}
