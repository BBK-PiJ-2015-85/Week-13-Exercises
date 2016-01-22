import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

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
	
	@Test
	public void testsBookNotTaken() {
		assertFalse(book.isTaken());
	}
	
	@Test
	public void testsTakingBook() {
		book.setTaken(true);
		assertTrue(book.isTaken());
	}
	
	@Test
	public void testsReturnBook() {
		book.setTaken(true);
		book.setTaken(false);
		assertFalse(book.isTaken());
	}
}