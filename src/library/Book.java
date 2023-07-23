package library;

public class Book {
	String authorName;
	String bookName;
	boolean isBookAvailable;
	int count = 3;
	int quantityOfBook;
	Student[] students;

	public Book(String nameOfAuthor, String nameOfBook, int quantityBook, boolean isAvailable, Student[] student) {
		authorName = nameOfAuthor;
		bookName = nameOfBook;
		isBookAvailable = isAvailable;
		quantityOfBook = quantityBook;
		students = student;
	}
}
