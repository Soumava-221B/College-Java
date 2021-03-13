													// 04-12-20
package Dates.com;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;

public class LegacyDate_R {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date legacyDate=new Date();
		System.out.println(legacyDate);
		LocalDateTime newDate=LocalDateTime.ofInstant(legacyDate.toInstant(),ZoneId.systemDefault());
		System.out.println(newDate);
		
		//
		Calendar c=Calendar.getInstance();
		System.out.println(c);
		LocalDateTime newCal=LocalDateTime.ofInstant(c.toInstant(), ZoneId.systemDefault());
		System.out.println(newCal);

	}

}
