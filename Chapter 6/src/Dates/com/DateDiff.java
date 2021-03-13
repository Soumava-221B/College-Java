																					// 30-11-20
package Dates.com;

import java.time.LocalDate;
import java.time.Period;

public class DateDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate endoCentury=LocalDate.of(2000, 12, 31);
		LocalDate now = LocalDate.now();
		Period diff = Period.between(endoCentury, now);
		System.out.printf("The 21st century (up to %s) is %s of d%n",now,diff);
		System.out.printf("The 21st century is %d years, %d months and %d days old",diff.getYears(),diff.getMonths(),diff.getDays());
	}

}
