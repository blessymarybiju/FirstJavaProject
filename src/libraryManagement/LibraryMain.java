package libraryManagement;

import java.util.Scanner;

public class LibraryMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Books booksInLibrary = new Books();
		Students registeredStudents = new Students();
		int choice;
		var maximumBookCanBeBorrowed = 0;
		var option = "n";
		System.out.println("Welcome to online Library \nPlease log in to continue using the application! \n");
		var isValidUser = registeredStudents.loginValidation();
		if (isValidUser) {
			do {
				booksInLibrary.displayMenu();
				choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println(
							"Enter the type of book you search: \n -Famous \n -Fiction \n -Thriller \n -Kids \n -Novel \n");
					var type = sc.next();
					booksInLibrary.searchBook(type);
					break;
				case 2:
					System.out.println("Enter the name of the author of the book you like to search: ");
					var authorName = sc.next();
					System.out.println("Enter the name of the book of " + authorName + " you like to search: ");
					var nameOfBook = sc.next();
					booksInLibrary.searchBook(nameOfBook, authorName);
					break;
				case 3:
					booksInLibrary.showAllBooks();
					break;
				case 4:
					registeredStudents.showAllStudents();
					break;
				case 5:
					do {
						if (maximumBookCanBeBorrowed < 3) {
							System.out.println("\nEnter the name of the book you want to borrow:");
							var bookName = sc.next();
							var cnt = booksInLibrary.borrowBook(bookName);
							if (cnt == 1) {
								maximumBookCanBeBorrowed++;
							} else if (cnt == -1) {
								System.out.println("You can't borrow same book again!");
							}
						} else {
							System.out.println("You can't borrow more than 3 book.");
							break;
						}
						System.out.println("Do you want to borrow more book( please enter y for yes, n for no)");
						option = sc.next();
					} while (option.equals("y"));
					break;
				case 6:
					registeredStudents.logoutAccount();
					break;
				case 0:
					System.out.println("Thank you for using online library...");
					break;
				default:
					System.out.println("Please enter a valid option!!!\n");
					break;
				}
			} while (choice != 0);
		}
		sc.close();
	}
}
