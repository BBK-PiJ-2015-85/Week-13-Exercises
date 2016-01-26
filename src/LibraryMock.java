public class LibraryMock implements Library {
	
	public int getID(String name) {
		return 13;
	}
	
	public String getName() {
		return "Library Mock";
	}
	
	public int getMaxBooksPerUser() {
		return 1000;
	}

	public void addBook(String title, String author) {
		return;
	}


	public Books takeBook(String title) {
		return null;
	}

	public void returnBook(Books book) {
		return;
	}

	public int getReaderCount() {
		return 1000;
	}

	public int getBookCount() {
		return 1000;
	}

	public int getBookBorrowedCount(){
		return 1000;
	}
}