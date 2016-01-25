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
	* @param String name of the user
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
	* @param the title and the author of the book.
	*/
	void addBook(String title, String author); 
	
	/**
	* If the book is not taken, marks the book as taken and returns it. 
	* If the book is taken or does not exist, null is returned.
	* @param the title of the book.
	* @return the book if it is not taken or null if it is.
	*/
	Books takeBook(String title);
	
	/**
	* Marks the book as not taken.
	* @param the book being returned.
	*/
	void returnBook(Books book);
	
}