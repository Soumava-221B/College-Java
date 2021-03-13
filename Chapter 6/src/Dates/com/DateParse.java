package Dates.com;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateParse {

	public static void main(String[] args) {
		
		String obj = "1914-11-11";
		LocalDate aLD = LocalDate.parse(obj);
		System.out.println("Date: " + aLD);
		
		String obj2 = "1914-11-11T11:11";
		LocalDateTime aLDT = LocalDateTime.parse(obj2);
		System.out.println("Date/Time: " + aLDT);
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd MMM uuuu");
		String anotherDate = "27 Jan 2011";
		LocalDate random = LocalDate.parse(anotherDate, df);
		System.out.println(anotherDate + " parses as " + random);
		
		System.out.println(aLD + " formats as " + df.format(aLD));

	}

}
