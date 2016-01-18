public class LibraryImpl implements Library {
	private String libName;
	private int maxBooksPerUser;
	private String[] libraryUsers;
	private int totalUsers;
	private int[] userIDs;
	private static final int DEFAULT_SIZE = 20;
	
	public LibraryImpl(String name) {
		libName = name;
		libraryUsers = new String[DEFAULT_SIZE];
		userIDs = new int[DEFAULT_SIZE];
		totalUsers = 0;
	}
	
	public int getID(String name) {
		for (int i = 0; i < totalUsers; i++) {
			if (libraryUsers[i].equals(name)) {
				return userIDs[i];
			}
		}
		userIDs[totalUsers] = totalUsers;
		libraryUsers[totalUsers] = name;
		totalUsers++;
		return userIDs[totalUsers - 1];
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