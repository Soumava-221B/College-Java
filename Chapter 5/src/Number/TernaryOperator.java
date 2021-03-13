																						// 23-11-20
package Number;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		
		int n1=5, n2=10 , max;
		System.out.println("Fisrt num: "+n1);
		System.out.println("Second num: "+n2);
		
		// Largest among n1 and n2
		max = (n1>n2)? n1: n2;
		
		// Print the largest number
		System.out.println("Maximum is = "+max);
		
		// other way
		//take input fro users
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your marks: ");
		double marks = input.nextDouble();
		
		String result = (marks>40) ? " pass " : " fail ";
		
		System.out.println("You"+ result +"the exam");
		input.close();
		
	}

}
