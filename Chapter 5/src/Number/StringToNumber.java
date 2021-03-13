package Number;

import java.util.Scanner;

public class StringToNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		String aNumber1=sc.next();
		int result;
		try {
			result = Integer.parseInt(aNumber1);
			System.out.println("Number is "+result);
		}
		catch(NumberFormatException exc)
		{
			System.out.println("Invalid Number "+aNumber1);
			return;
		}

	}

}
