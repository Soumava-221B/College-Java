/*
 * Write a Java program to get current full date and time.
 */
package Assingment;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate obj=LocalDate.now();
		System.out.println("todays date: " +obj);
		
		LocalTime obj1=LocalTime.now();
		
		LocalDateTime obj2=LocalDateTime.now();
		System.out.println("Current date and time: "+obj2);


	}

}
