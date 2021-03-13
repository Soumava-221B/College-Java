package io;

import java.util.regex.Pattern;

public class Example {

	public static void main(String[] args) {
	
		String pattern = "^Q[^u]\\d+\\.";
		String[] input = {"QA777.where are you.","Isha, Anjali, monalisa!"};
		Pattern p = Pattern.compile(pattern);
		for (String in : input) {
		boolean found = p.matcher(in).lookingAt();
		System.out.println(" " + pattern + "-" +(found ? " matches:-" : " doesn't match:- '") + in + "'");
		//StringBuffer s1 = new StringBuffer("Hello"); s1.setCharAt(2,R); System.out.println(s1);



	}

}}
