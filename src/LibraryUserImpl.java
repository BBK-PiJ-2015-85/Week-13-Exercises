public class LibraryUserImpl implements LibraryUser {
	private String name;
	private int userID;
	private Library myLibrary;
	
	public LibraryUserImpl(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getID() {
		return userID;
	}
	
	public int register(Library library) {
		myLibrary = library;
		userID = library.getID();
		return userID;
	}
	
	public String getLibrary() {
		return myLibrary.getName();
	}
}