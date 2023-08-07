package libraryManagement;

public class Book {

	public int serialNo;
	public String bookName;
	public String authorName;
	public int bookQty;
	public int bookQtyCopy;
	BookType typeOFBook;

	public Book(int serialNo, String authorName, String bookName, int bookQty, BookType typeOFBook) {
		this.serialNo = serialNo;
		this.authorName = authorName;
		this.bookName = bookName;
		this.bookQty = bookQty;
		this.bookQtyCopy = bookQty;
		this.typeOFBook = typeOFBook;
	}

	public enum BookType {
		FAMOUS("Famous"), 
		FICTION("Fiction"), 
		KIDS("Kids"), 
		THRILLER("Thriller"), 
		NOVEL("Novel");

		String nameOfBookType;

		BookType(String typeOfTheBook) {
			nameOfBookType = typeOfTheBook;
		}

		String getTypeOfBook() {
			return nameOfBookType;
		}
	}
}
