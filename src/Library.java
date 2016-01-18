/**
* Libraries have a name set at construction time.
* They also have a maximum number of books that can be 
* borrowed by a user at any one time.
*/

public interface Library {
	/**
	* returns the user ID
	* @return the user ID
	*/
	int getID();
	
	/**
	* returns the library name
	* @return the libray name
	*/
	String getName();
	
	/**
	* @return the maximum number of books a user can borrow at a time
	*/
	int getMaxBooksPerUser();
	
}