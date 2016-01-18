public class LibraryImpl implements Library {
	private String libName;
	private int maxBooksPerUser;
	
	public LibraryImpl(String name) {
		libName = name;
	}
	
	public int getID() {
		return 13;
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
}