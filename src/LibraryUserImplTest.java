import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class LibraryUserImplTest {
	LibraryUser user;
	Library mockLib;
	
	@Before
	public void setUp() {
		user = new LibraryUserImpl("Joe Bloggs");	
		mockLib = new LibraryMock();
	}
	
	@Test
	public void testsGetName() {
		assertEquals("Joe Bloggs", user.getName());
	}
	
	@Test
	public void testsSetIDthenGetID() {
		user.register(mockLib);
		assertEquals(13, user.getID());
	}
	
	@Test
	public void testsRegisterWithLibrary() {
		assertEquals(13, user.register(mockLib));
	}
	
	@Test
	public void testsGetLibraryName() {
		user.register(mockLib);
		assertEquals(mockLib, user.getLibrary());
	}
}