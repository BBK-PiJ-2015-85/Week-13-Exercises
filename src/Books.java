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
	
}