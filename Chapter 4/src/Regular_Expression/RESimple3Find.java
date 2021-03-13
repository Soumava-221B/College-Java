package Regular_Expression;

import java.util.regex.*;

public class RESimple3Find {

	public static void main(String[] args) {
		String pattern = "abd";
		String input = "pqr abd pxy";
		Pattern p = Pattern.compile(pattern);
		Matcher m=p.matcher(input);
		if(m.find())
		{
			System.out.println("Pattern " +pattern+ " found is string "+input);
		}
		else
		{
			System.out.println("Pattern " +pattern+ " not found in string "+input);
		}

	}

}
