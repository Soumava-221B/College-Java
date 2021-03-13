package io;

public class DegreeToRadians {

	public static void main(String[] args) {
		/*Write a java program that takes a double value t from the command line and prints the value of 
		 sin (2t) + sin (3t).*/
		    	  double degree = Double.parseDouble(args[0]);
		    	  
		    	 // double t = Math.toRadians(degree);
		    	  
		    	 // System.out.println(t);
		    	  double value = Math.sin(2*degree) + Math.sin(3*degree);
		    	  //double di=Math.toRadians(value);
		    	  
		    	  System.out.println(value);
		    	  

	}

}
