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
	public void testsOnePErsonGetUserID() {
		assertEquals(0, lib.getID("Joe Bloggs"));
	}
	
	@Test
	public void testTwoPeopleGetUSerID() {
		lib.getID("Joe Bloggs");
		lib.getID("Tim");
		assertEquals(1, lib.getID("Tim"));
	}
	
	@Test
	public void testsAddThreePeopleGetThirdID() {
		lib.getID("Joe Bloggs");
		lib.getID("Tim");
		lib.getID("Dan");
		assertEquals(2, lib.getID("Dan"));
	}
	
	@Test 
	public void testsAddingSameNameMultipleTimes() {
		lib.getID("Dan");
		lib.getID("Dan");
		lib.getID("Dan");
		lib.getID("Dan");
		lib.getID("Dan");
		assertEquals(0, lib.getID("Dan"));
	}
	
	@Test
	public void testsAddingEnoughPeopleSoArraySizeNeedsIncreasing() {
		String str = "";
		for (int i = 0; i < 30; i++) {
			str = "" + i;
			lib.getID(str);
		}
		assertEquals(29, lib.getID("29"));
	}
	
	@Test
	public void testsAddingFour() {
		lib.getID("Dan");
		lib.getID("Tan");
		lib.getID("Nan");
		assertEquals(3, lib.getID("Pete"));
	}
}