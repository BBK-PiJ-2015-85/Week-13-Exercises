import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class LibraryImplTest {
	Library lib;
	
	@Before
	public void setUp() {
		lib = new LibraryImpl("Lib Test");
	}
	
	@Test
	public void testsGetName() {
		assertEquals("Lib Test", lib.getName());
	}
	
	@Test
	public void testsGetMaxNoBooks() {
		((LibraryImpl)lib).setMaxBooksPerUser(3);
		assertEquals(3, lib.getMaxBooksPerUser());
	}
	
	@Test
	public void testsGetUserID() {
		assertEquals(13, lib.getID());
	}
}