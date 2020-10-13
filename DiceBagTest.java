package hw6;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import static org.junit.jupiter.api.Assertions.*;



class DiceBagTest {
	
	DiceBag db;
	Token t =new Token("Tom");
	

	@Test
	void testAddToken() {
		when(db.addToken(t)).thenReturn(true);
		assertEquals(db.addToken(t),true);
		//fail("Not yet implemented");
	}

	@Test
	void testDrawToken() {
		when(db.drawToken()).thenReturn(null);
		assertEquals(db.drawToken(),null);
		//fail("Not yet implemented");
	}

	@Test
	void testToString() {
		
		assertEquals(db.toString()," Dice left: 0\n");
		
	//	fail("Not yet implemented");
	}

}