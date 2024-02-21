package time;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class TimeTestw3 {

	@Test
	void testGetTotalSecondsGood() {
		int seconds = Time.getTotalSeconds("05:05:05:00");
		assertTrue("The seconds were not calculated properly", seconds == 18305);
	}
	
	@Test
	void testGetTotalSecondsBad() {
		assertThrows(StringIndexOutOfBoundsException.class, () -> {Time.getTotalSeconds("10:00");});
	}
	
	@Test
	void testGetTotalSecondsBoundary() {
		int seconds = Time.getTotalSeconds("23:59:59:59");
		assertTrue(seconds == 86399);
	}
	
	@Test
	void testGetSecondsGood() {
		int seconds = Time.getTotalSeconds("00:00:18:00");
		assertTrue("The seconds were not calculated properly", seconds == 18);
	}
	
	@Test
	void testGetSecondsBad() {
		assertThrows(StringIndexOutOfBoundsException.class, () -> {Time.getTotalSeconds("14");});
	}
	
	@Test
	void testGetSecondsBoundary() {
		int seconds = Time.getTotalSeconds("00:00:59:00");
		assertTrue("The seconds were not calculated properly", seconds == 59);
	}

	//Minutes

	@Test
	void testGetTotalMinutesGood() {
		int minutes = Time.getTotalMinutes("02:18:45:20");
		assertTrue("The minutes were not calculated properly", minutes == 18);
	}
	@Test
	void testGetTotalMinutesBoundary() {
		int minutes = Time.getTotalMinutes("23:59:59:59");
		assertTrue("The minutes were not calculated properly", minutes == 59);
	}
	@Test
	void testGetTotalMinutesBad() {
		assertThrows(StringIndexOutOfBoundsException.class, () -> {Time.getTotalMinutes("7:09");});
		
	}
	
	//Hours

	@ParameterizedTest
	@ValueSource(strings = {"09:00:00:00", "09:15:25:18"})
	void testGetTotalHoursGood(String candidate) {
		int hours = Time.getTotalHours(candidate);
		assertTrue("The hours were not calculated properly", hours == 9);
	}
	
	@Test
	void testGetTotalHoursBad() {
		assertThrows(StringIndexOutOfBoundsException.class, () -> {Time.getTotalHours("7");});
	}
	
	@Test
	void testGetTotalHoursBoundary() {
		int hours = Time.getTotalHours("23:59:59:59");
		assertTrue("The hours were not calculated properly", hours == 23);
	}
	
	//Milliseconds
	
	@Test
	void testGetMillisecondsGood() {
		int milliseconds = Time.getMilliseconds("12:05:05:06");
		assertTrue("The milliseconds were not calculated properly", milliseconds == 6);
		
	}
	
	@Test
	void testGetMillisecondsBad() {
		assertThrows(StringIndexOutOfBoundsException.class,() -> {Time.getMilliseconds("12:05:05");});
		
	}
	
	@Test
	void testGetMillisecondsBoundary() {
		int milliseconds = Time.getMilliseconds("12:05:05:59");
		assertTrue("The milliseconds were not calculated properly", milliseconds == 59);
		
	}

}
