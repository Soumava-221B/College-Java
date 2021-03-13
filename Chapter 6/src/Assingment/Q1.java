/*
 * Write a Java program to get the current time in New York.
 */
package Assingment;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class Q1 {

	public static void main(String[] args) {
		
		SimpleDateFormat dateTimeInGMT = new SimpleDateFormat("yyyy-MMM-dd hh:mm:ss aa");
		
		dateTimeInGMT.setTimeZone(TimeZone.getTimeZone("GMT-5"));
		System.out.print("Current Time In New York: ");
		System.out.println(dateTimeInGMT.format(new Date()));
	}

}
