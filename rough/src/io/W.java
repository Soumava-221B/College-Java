package io;

public class W {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Body Mass Index (BMI) is a measure of health on weight. It can be calculated by taking your
		  weight in kilograms and dividing by the square of your height in meters. 
		  Write a java program that prompts the user to enter a weight in pounds and height in inches 
		  and displays the BMI */
		
		double Weight = Double.parseDouble(args[0]);
		//Weight is in pound.
		double Height = Double.parseDouble(args[1]);
		//Height is in inches.
		double Kg = (0.45359237*Weight);
		//Now the weight is in Kg.
		double m = (0.0254*Height);
		//Now Height is in meter.
		double BMI = ((Kg)/Math.pow(m, 2));
		System.out.println(BMI);

	}

}
