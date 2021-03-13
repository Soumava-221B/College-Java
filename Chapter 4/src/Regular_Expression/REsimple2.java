package Regular_Expression;

import java.util.regex.*;

public class REsimple2 {

	public static void main(String[] args) {
		String pattern = "pqr";
		String input = "pqr abd pxy";
		Pattern p = Pattern.compile(pattern);
		Matcher m=p.matcher(input);
		if(m.matches())
		{ 
			System.out.println("Pattern " +pattern+ "found is string "+input);
		}
		else
		{
			System.out.println("Pattern " +pattern+ " not found in string "+input);
		}

	}
		

	}


