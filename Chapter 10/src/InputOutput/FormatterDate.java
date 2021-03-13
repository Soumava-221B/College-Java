package InputOutput;

import java.util.Calendar;

public class FormatterDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%4d-%02d-%2d%n", 2014, 6, 28);
		
		java.util.Date today = Calendar.getInstance().getTime();
		System.out.printf("Today is %1$tB %1$td, %1$tY%n", today);

	}

}
