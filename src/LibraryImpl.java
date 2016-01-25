public class LibraryImpl implements Library {
	private String libName;
	private int maxBooksPerUser;
	private String[] libraryUsers;
	private int totalUsers;
	private static final int DEFAULT_SIZE = 10;
	private Books[] libraryBooks;
	private int totalBooks;
	
	public LibraryImpl(String name) {
		libName = name;
		libraryUsers = new String[DEFAULT_SIZE];
		totalUsers = 0;
		libraryBooks = new Books[DEFAULT_SIZE];
		totalBooks = 0;
	}
	
	public int getID(String name) {
		for (int i = 0; i < totalUsers; i++) {
			if (libraryUsers[i].equals(name)) {
				return i;
			}
		}
		if (libraryUsers.length == totalUsers) {
			String[] temp = new String[totalUsers * 2];
			for (int i = 0; i < totalUsers; i++) {
				temp[i] = libraryUsers[i];
			}
			libraryUsers = temp;
		}
		libraryUsers[totalUsers] = name;
		totalUsers++;
		return totalUsers - 1;
	}
	
	public String getName() {
		return libName;
	}
	
	public int getMaxBooksPerUser() {
		return maxBooksPerUser;
	}
	
	public void setMaxBooksPerUser(int num) {
		maxBooksPerUser = num;
	}
	
	public void addBook(String title, String author) {
		if (libraryBooks.length == totalBooks) {
			Books[] temp = new Books[totalBooks * 2];
			for (int i = 0; i < totalBooks; i++) {
				temp[i] = libraryBooks[i];
			}
			libraryBooks = temp;
		}
		libraryBooks[totalBooks] = new BooksImpl(title, author);
		totalBooks++;
	}
	
	public Books takeBook(String title) {
		for (int i = 0; i < totalBooks; i++) {
			if (libraryBooks[i].getTitle().equals(title) && !libraryBooks[i].isTaken()) {
				libraryBooks[i].setTaken(true);
				return libraryBooks[i];
			}
		}
		return null;
	}
	
	public void returnBook(Books book) {
		for (int i = 0; i < totalBooks; i++) {
			if (libraryBooks[i].getTitle().equals(book.getTitle()) && libraryBooks[i].isTaken()) {
				libraryBooks[i].setTaken(false);
				return;
			}
		}
	}
}