package Regular_Expression;

import java.util.regex.*; 
import java.util.Scanner;

public class ValidMobileNo {
	public static boolean ValidVerify(String s) 
	{ 
		Pattern p = Pattern.compile("^\\+(?:[0-9] ?){6,14}[0-9]$"); 
 
		Matcher m = p.matcher(s); 
		return (m.find() && m.group().equals(s)); 
	} 

	public static void main(String[] args) {
		String phone1 = "+91 3423 546443"; 
		String phone2 = "+44 343 2324";
		String phone3 = "91 4354 3454";
		String[] phoneNumbers= {phone1,phone2,phone3};
 
		for (int i = 0; i < phoneNumbers.length; i++) {
			String phoneNumber=phoneNumbers[i];
			if (ValidVerify(phoneNumber)) 
				System.out.print(phoneNumber+" is valid phone number"); 
			else
				System.out.print(phoneNumber+" is invalid Phone number"); 
 
			System.out.println();
		}	 

	}

}
