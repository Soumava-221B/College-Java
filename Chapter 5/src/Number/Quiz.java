package Number;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		Scanner y= new Scanner(System.in);
		System.out.println("Enter the string");
		String num=y.next();
		String[] arr=num.split("\\.");
		int whole=Integer.parseInt(arr[0]);
		int fraction=Integer.parseInt(arr[1]);
		System.out.println("Whole Part: "+whole);
		System.out.println("Fraction Part: "+fraction);
		System.out.println("Summation is:"+(whole+fraction));
	}

}
