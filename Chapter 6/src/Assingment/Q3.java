/*
 * Write a Java program to get the last day of the current month.
 */
package Assingment;

import java.util.Calendar;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
	      int res = cal.getActualMaximum(Calendar.DATE);
	      System.out.println("Today's Date = " + cal.getTime());
	      System.out.println("Last Date of the current month = " + res);
		
		

	}

}
