package Regular_Expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Phonenumber {

	public static void main(String[] args) {
		
		String regex ="\\b(\\d{3})(\\d{3})(\\d{4})\\b"; // format
		Pattern p =Pattern.compile(regex);
		String source = "1234567890, 12345, and 9876543210";
		Matcher m=p.matcher(source);
		
		System.out.println("Phone number source format: "+source);
		
		while(m.find())
		{
			System.out.println("Phone:"+m.group()+",Formatted Phone :("+m.group(1)+")"+m.group(2)+"-"+m.group(3));
			
		}
		String number =source.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1)-$2-$3");
		System.out.println("Format the phone:"+number);

	}

}
