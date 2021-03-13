																				// 30-11-20
package Dates.com;

import java.time.*;

public class DateConversion {

	public static void main(String[] args) {
		System.out.println("Current epouch milliseconds= "+System.currentTimeMillis());
		
		long epochSecond=ZonedDateTime.now().toInstant().getEpochSecond();
		System.out.println("Current epoch seconds= "+epochSecond);
		
		Instant epochSec = Instant.ofEpochSecond(1000000000L);
		ZoneId zId=ZoneId.systemDefault();
		ZonedDateTime then= ZonedDateTime.ofInstant(epochSec, zId);
		System.out.println("The epoch was a billion seconds old on "+then);
	}

}
