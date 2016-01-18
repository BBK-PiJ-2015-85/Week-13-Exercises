/**
* Library users have a name and a library-ID (an int), both of
* which are unique. Name must be set at construction time.
*/

public interface LibraryUser {
	
	/**
	* returns the user's name
	* @return the library user's name
	*/
	String getName();
	
	/**
	* returns the user's ID
	* @return the library user's ID
	*/
	int getID();
	
	/**
	* registers the user with a library
	* @param Library the library to register with
	* @return the new library userID number
	*/
	int register(Library library);
	
	/**
	* returns the library that the user is registered with
	* @return the library the user is registered with
	*/
	Library getLibrary();
	
}