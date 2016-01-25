/**
* Libraries have a name set at construction time.
* They also have a maximum number of books that can be 
* borrowed by a user at any one time.
*/

public interface Library {
	/**
	* returns the user ID
	* if the person does not yet have an ID, a new unique ID is created and returned.
	* any subsequent calls to the method with the same name argument should return the 
	* same ID.
	* @param name String name of the user
	* @return the user ID
	*/
	int getID(String name);
	
	/**
	* returns the library name
	* @return the libray name
	*/
	String getName();
	
	/**
	* @return the maximum number of books a user can borrow at a time
	*/
	int getMaxBooksPerUser();

	/**
	* Adds a new book to the list of books in this library.
	* @param title the title of the book.
	* @param author the author of the book.
	*/
	void addBook(String title, String author); 
	
	/**
	* If the book is not taken, marks the book as taken and returns it. 
	* If the book is taken or does not exist, null is returned.
	* @param title the title of the book.
	* @return the book if it is not taken or null if it is.
	*/
	Books takeBook(String title);
	
	/**
	* Marks the book as not taken.
	* @param book the book being returned.
	*/
	void returnBook(Books book);
	
	/**
	* @return the number of users registered in this library.
	*/
	int getReaderCount(); 
	
	/**
	* @return the number of books in this library.
	*/
	int getBookCount();
	
	/**
	* @return the number of borrowed books in this library.
	*/
	int getBookBorrowedCount();
	
}