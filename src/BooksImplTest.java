import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class BooksImplTest {
	Books book;
	
	@Before
	public void setUp() {
		book = new BooksImpl("Test Book", "Joe Bloggs");
	}
	
	@Test
	public void testsGetTitle() {
		assertEquals("Test Book", book.getTitle());
	}
	
	@Test
	public void testsGetAuthor() {
		assertEquals("Joe Bloggs", book.getAuthor());
	}
}