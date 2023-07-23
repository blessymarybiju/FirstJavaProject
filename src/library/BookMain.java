package library;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int bookQuantity = 3;
		String borrowMoreBook;
		int sId;
		String tryStudentIdAgain="n";

		Student student1 = new Student(21, "Divya");
		Student student2 = new Student(22, "Manju");
		Student student3 = new Student(23, "Deepak");
		Student[] allStudent = { student1, student2, student3 };

		Book trulyDevious = new Book("Maureen_Johnson", "TheVanishingStair", 2, false, allStudent);
		Book serpentAndDove = new Book("Shelby_Mahurin", "Gods_And_Monsters", 1, false, allStudent);
		Book harryPotter = new Book("JKRowling", "thePrisonerOfAzkaban", 2, false, allStudent);
		Book famousFive = new Book(" EileenSoper", "FiveOnATreasureIsland", 4, false, allStudent);
		Book lordOfTheRings = new Book("JR", "lordOfTheRings", 1, false, allStudent);
		Book[] nameOfBook = { trulyDevious, serpentAndDove, harryPotter, famousFive, lordOfTheRings };

		do {
			if(tryStudentIdAgain.equals("y"))
			{
				bookQuantity=3;
			}
			System.out.println("Enter the student id to borrow books: ");
			sId = sc.nextInt();
			for (int j = 0; j < allStudent.length; j++) {
				if (allStudent[j].studentID == sId) {
					do {
						System.out.println("Enter the name of the book you want to borrow:");
						String bookName = sc.next();
						for (int i = 0; i < nameOfBook.length; i++) {
							nameOfBook[i].quantityOfBook--;
							if (nameOfBook[i].bookName.equals(bookName) && nameOfBook[i].isBookAvailable == false) {
								if (nameOfBook[i].quantityOfBook == 0) {
									nameOfBook[i].isBookAvailable = true;
								}
								bookQuantity--;
								break;
							} else if (nameOfBook[i].bookName.equals(bookName)
									&& nameOfBook[i].isBookAvailable == true) {
								System.out.println(nameOfBook[i].bookName + " is out of stock!!!");
								break;
							}
						}
						if (bookQuantity == 0) {
							System.out.println("You borrowed Maximum number of books!!!");
							break;
						}
						System.out.println("No of books you can borrow is:" + (bookQuantity));
						System.out.println("Do you want to borrow more books(y/n):");
						borrowMoreBook = sc.next();
					} while (borrowMoreBook.equals("y") && bookQuantity != 0);
				} 
			}
			System.out.println("Do you want try with a different student id(y/n): ");
			tryStudentIdAgain = sc.next();
		} while (tryStudentIdAgain.equals("y"));
		sc.close();
	}
}
