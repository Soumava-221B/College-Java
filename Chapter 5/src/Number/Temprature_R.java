package Number;

import java.util.Scanner;

public class Temprature_R {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double f =sc.nextDouble();
		double celsius=((5*(f-32.0))/9.0);
		System.out.println(f+ "fahrent is equal to "+celsius+" CELSIUS");

	}

}
