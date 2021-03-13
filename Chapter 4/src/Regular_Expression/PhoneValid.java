package Regular_Expression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneValid {
	public static boolean isValid(String s)
	{
		Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}");
		Matcher m = p.matcher(s);
		return (m.find() &&m.group().equals(s));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter value:");
		String s=sc.nextLine();
		System.out.println("Phone number is:"+s);
		if(isValid(s))
			System.out.println("Valid Number");
		else 
		System.out.println("Invalid Number");
	}

}
