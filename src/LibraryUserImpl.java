public class LibraryUserImpl implements LibraryUser {
	private String name;
	private int userID;
	
	public LibraryUserImpl(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getID() {
		return userID;
	}
	
	public void setID(int userID) {
		this.userID = userID;
	}
}