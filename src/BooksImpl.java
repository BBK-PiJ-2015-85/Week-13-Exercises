public class BooksImpl implements Books {
	private String title;
	private String author;
	boolean isTaken;
	
	public BooksImpl(String title, String author) {
		this.title = title;
		this.author = author;
		this.isTaken = false;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public boolean isTaken() {
		return isTaken;
	}
	
	public void setTaken(boolean taken) {
		this.isTaken = taken;
	}
}