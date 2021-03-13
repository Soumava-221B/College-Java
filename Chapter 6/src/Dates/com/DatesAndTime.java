package Dates.com;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DatesAndTime {

	public static void main(String[] args) {
		
		LocalDate obj=LocalDate.now();
		System.out.println("todays date: " +obj);
		
		LocalTime obj1=LocalTime.now();
		
		LocalDateTime obj2=LocalDateTime.now();
		System.out.println("Current date and time: "+obj2);

	}
}
