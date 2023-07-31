package libraryManagement;

public class Book {

	public int serialNo;
	public String bookName;
	public String authorName;
	public int bookQty;
	public int bookQtyCopy;
	BookType typeOFBook;

	public Book(int sNo, String nameOfAuthor, String nameOfBook, int quantityOfBook, BookType type) {
		serialNo = sNo;
		authorName = nameOfAuthor;
		bookName = nameOfBook;
		bookQty = quantityOfBook;
		bookQtyCopy = quantityOfBook;
		typeOFBook=type;
	}

	public enum BookType
	{
		FAMOUS("Famous"),
		FICTION("Fiction"),
		KIDS("Kids"),
		THRILLER("Thriller"),
		NOVEL("Novel");
		
		String nameOfBookType;
		
		BookType(String typeOfTheBook)
		{
			nameOfBookType=typeOfTheBook;
		}
		String getTypeOfBook()
		{
			return nameOfBookType;
		}
	}
}
