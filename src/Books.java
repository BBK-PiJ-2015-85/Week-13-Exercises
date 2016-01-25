/**
* Books have authors and titles. These must be set
* at construction and never be modified afterwards.
*/

public interface Books {	
	
	/**
	* Returns the title
	* @return the book's title
	*/
	String getTitle();
	
	/**
	* Returns the author 
	* @return the book's author
	*/
	String getAuthor();
	
	/**
	* tells whether the book is taken or not
	* @return true if the book is taken, false if it is available
	*/
	boolean isTaken();
	
	/**
	* sets whether the book is taken or not
	* @param taken true if the book is taken, false if it is returned (i.e. available).
	*/
	void setTaken(boolean taken);
}