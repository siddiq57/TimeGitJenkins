package time;

/**
 * Taken from Wendi Jollymore :http://www-acad.sheridanc.on.ca/~jollymor/prog24178/oop2.html
 * @modfied by Liz Dancy
 * Used  as a base class
 * for the testing exercise with JUnit
 *  Winter 2021
 */
public class Time {
	
	public static void main(String[] args) {
		int totalSeconds = getTotalSeconds("10:10:10");
		System.out.println("**GH Total Second = " + totalSeconds);
		}

	public static int getTotalSeconds(String time)throws NumberFormatException, StringIndexOutOfBoundsException {
	
	System.out.println("get total seconds 1");
		int hours = getTotalHours(time);
		System.out.println("get total seconds 2");
		//we will eventually multiply the hours by 3600 + the minutes by 60 + the seconds
		int minutes = getTotalMinutes (time);
		System.out.println("get total seconds 3");
		int seconds = getSeconds(time);
		System.out.println("get total seconds 4");
		return hours * 3600 + minutes * 60 + seconds;
	}
	
	public static int getSeconds(String time) throws NumberFormatException, StringIndexOutOfBoundsException 
	{
		
		return Integer.parseInt(time.substring(6,8));
	}

	public static int getTotalMinutes(String time) throws NumberFormatException, StringIndexOutOfBoundsException
	{
		if (time.length()>11)
		{
			throw new NumberFormatException("your time was too long!");
		}
		return Integer.parseInt(time.substring(3,5));
	}

	public static int getTotalHours(String time)throws NumberFormatException, StringIndexOutOfBoundsException
	{
		return Integer.parseInt(time.substring(0,2));
	}

	public static int getMilliseconds(String time)throws NumberFormatException, StringIndexOutOfBoundsException {
		return Integer.parseInt(time.substring(9,11));
	}
	
		
	
}



