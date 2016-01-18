public class LibraryImpl implements Library {
	private String libName;
	private int maxBooksPerUser;
	private String[] libraryUsers;
	private int totalUsers;
	private static final int DEFAULT_SIZE = 10;
	
	public LibraryImpl(String name) {
		libName = name;
		libraryUsers = new String[DEFAULT_SIZE];
		totalUsers = 0;
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
}