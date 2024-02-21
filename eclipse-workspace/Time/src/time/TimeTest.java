package time;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class TimeTest {

	@Test
	void testGetTotalSeconds() {
		int seconds = Time.getTotalSeconds("05;05;05");	
		assertTrue("The seconds were not calculated properly", seconds==18305);
	}

	@Test
	public void testGetTotalSecondsBad() {
		assertThrows(StringIndexOutOfBoundsException.class, ()->{Time.getTotalSeconds("10:00");});
	}
	/*@Test
	void testGetSeconds() {
		fail("Not yet implemented");
	}

	@Test
	void testGetTotalMinutes() {
		fail("Not yet implemented");
	}

	@Test
	void testGetTotalHours() {
		fail("Not yet implemented");
	}
*/
}
