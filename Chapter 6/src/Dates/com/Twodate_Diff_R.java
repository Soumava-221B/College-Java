																			//	04/12/20
package Dates.com;

import java.time.LocalDate;
import java.time.Period;

public class Twodate_Diff_R {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate obj1=LocalDate.of(2020, 01, 31);
		LocalDate now=LocalDate.now();
		Period diff=Period.between(obj1, now);
		System.out.printf("The 21st century (up to %s) is %s old%n", now, diff);
		System.out.printf("The 21st Century is %d year, %d months and days old",diff.getYears(),diff.getMonths(),diff.getDays());

	}

}
