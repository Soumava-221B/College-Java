																// 04-12-20
package Dates.com;

import java.time.LocalDate;
import java.time.Period;

public class AddSubtractor_R {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate now=LocalDate.now();
		Period p=Period.ofDays(727);
		LocalDate then=now.plus(p);
		System.out.printf("Seven Hundrerd and Twenty Seven days from %s is %s%n ",now , then);
		
		System.out.println();
		// minus
		Period q=Period.ofDays(727);
		LocalDate t=now.minus(q);
		System.out.printf("Seven Hundrerd and Twenty Seven days from %s is %s%n ",now , t);

	}

}
