package Regular_Expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class ValidateIndainMobileNo {
	public static boolean isValidIndianMobileNumber(String s) 
	{ 
		Pattern p = Pattern.compile("^(?:(?:\\+|0{0,2})91(\\s*[\\-]\\s*)?|[0]?)?[789]\\d{9}$"); 
 
		Matcher m = p.matcher(s); 
		return (m.find() && m.group().equals(s)); 
	} 

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Three Mobile Numbers In India");
		String phone1 = sc.nextLine(); 
		String phone2 = "08123456789";
		String phone3 = "9876543210";
		String[] phoneNumbers= {phone1,phone2,phone3};
 
		for (int i = 0; i < phoneNumbers.length; i++) {
			String phoneNumber=phoneNumbers[i];
			if (isValidIndianMobileNumber(phoneNumber)) 
				System.out.print(phoneNumber+" is valid mobile number"); 
			else
				System.out.print(phoneNumber+" is invalid mobile number"); 
 
			System.out.println();
		}	 

	}

}
