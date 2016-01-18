public class BooksImpl implements Books {
	private String title;
	private String author;
	
	public BooksImpl(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
}