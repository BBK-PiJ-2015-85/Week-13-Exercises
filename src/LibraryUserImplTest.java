import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class LibraryUserImplTest {
	LibraryUser user;
	
	@Before
	public void setUp() {
		user = new LibraryUserImpl("Joe Bloggs");		
	}
	
	@Test
	public void testsGetName() {
		assertEquals("Joe Bloggs", user.getName());
	}
	
	@Test
	public void testsSetIDthenGetID() {
		((LibraryUserImpl)user).setID(12345);
		assertEquals(12345, user.getID());
	}
}