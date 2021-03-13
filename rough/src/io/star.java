/*
 * 
 */
package io;
import java.util.Scanner;

public class star {

	public static void main(String[] args) {
		//Write a java program that reads a Celsius degree in a double value from the console, then converts it to Fahrenheit and displays the result.
				double celsius = Double.parseDouble(args[0]);
				//double c=(((9.0/5) * celsius)+32);
				
				
				System.out.println("fahrenheit =" + (((9.0/5) * celsius)+32));
	}

}
