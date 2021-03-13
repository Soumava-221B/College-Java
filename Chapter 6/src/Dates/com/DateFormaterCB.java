package Dates.com;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormaterCB {

	public static void main(String[] args) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("LL-dd-yyyy");
		System.out.println(df.format(LocalDate.now()));
		
		DateTimeFormatter nTZ =DateTimeFormatter.ofPattern("d MMMM, yyyy h:mm a");
		System.out.println(ZonedDateTime.now().format(nTZ));

		LocalDateTime cdt=LocalDateTime.now();
		
		DateTimeFormatter f1=DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm a");
		String st=cdt.format(f1);
		System.out.println("formatted datetime: "+st);
		
		DateTimeFormatter f2=DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
		String st1=cdt.format(f2);
		System.out.println("format of date and time: "+st1);
		
		DateTimeFormatter ff=DateTimeFormatter.ISO_LOCAL_DATE;
		String ffff=ff.format(cdt);
		System.out.println("Output using through iso local date: "+ffff);
		DateTimeFormatter ff2=DateTimeFormatter.ISO_LOCAL_TIME;
		String f3=ff2.format(cdt);
		System.out.println("Output using through iso local Time: "+f3);
		
		
	}
	

}
