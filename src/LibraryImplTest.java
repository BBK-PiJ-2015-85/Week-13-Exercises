import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

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
	public void testsAddingFourPeople() {
		lib.getID("Dan");
		lib.getID("Tan");
		lib.getID("Nan");
		assertEquals(3, lib.getID("Pete"));
	}
	
	@Test
	public void testsAddOneNewBook() {
		lib.addBook("PiJ", "Keith Mannock");
		assertEquals("PiJ", lib.takeBook("PiJ").getTitle());
	}
	
	@Test
	public void testsAddTwoNewBooks() {
		lib.addBook("PiJ", "Keith Mannock");
		lib.addBook("Test", "James Pickles");
		assertEquals("Test", lib.takeBook("Test").getTitle());
	}
	
	@Test
	public void testsAddsFourBooksThenTakesOne() {
		lib.addBook("PiJ", "Keith Mannock");
		lib.addBook("Test", "James Pickles");
		lib.addBook("Test1", "Keith Mannock");
		lib.addBook("Test2", "James Pickles");
		assertEquals("Test1", lib.takeBook("Test1").getTitle());
	}
	
	@Test
	public void testsTakeABookAlreadyTaken() {
		lib.addBook("PiJ", "Keith Mannock");
		lib.takeBook("PiJ");
		assertNull(lib.takeBook("PiJ"));
	}
	
	@Test
	public void testsAddTwoCopiesAndTakeThemBoth() {
		lib.addBook("PiJ", "Keith Mannock");
		lib.addBook("PiJ", "Keith Mannock");
		lib.takeBook("PiJ");
		assertEquals("PiJ", lib.takeBook("PiJ").getTitle());
	}
	
	@Test
	public void testsTakesAbookThenReturnsThenTakesAgain() {
		lib.addBook("PiJ", "Keith Mannock");
		Books book1 = lib.takeBook("PiJ");
		lib.returnBook(book1);
		assertEquals("PiJ", lib.takeBook("PiJ").getTitle());
	}
	
	@Test
	public void testsTriesToTakeABookOnLoan() {
		lib.addBook("PiJ", "Keith Mannock");
		lib.addBook("PiJ", "Keith Mannock");
		lib.takeBook("PiJ");
		lib.takeBook("PiJ");
		assertNull(lib.takeBook("PiJ"));
	}
	
	@Test
	public void testsAddTwoBooksSameThenReturnsBoth() {
		lib.addBook("PiJ", "Keith Mannock");
		lib.addBook("PiJ", "Keith Mannock");
		Books book1 = lib.takeBook("PiJ");
		Books book2 = lib.takeBook("PiJ");
		lib.returnBook(book1);
		lib.returnBook(book2);
		assertEquals("PiJ", lib.takeBook("PiJ").getTitle());
	}
}