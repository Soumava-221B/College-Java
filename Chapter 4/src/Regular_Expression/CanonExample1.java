package Regular_Expression;

import java.util.regex.Pattern;

public class CanonExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String pattStr = "\u00e9gal"; 
		String[] input = {
		"\u00e9gal", "e\u0301gal","e\u02cagal", "e'gal", "e\u00b4gal", };
		Pattern pattern = Pattern.compile(pattStr, Pattern.CANON_EQ);
		for (int i = 0; i < input.length; i++) {
		if (pattern.matcher(input[i]).matches()) {
			
			System.out.println(pattStr + " matches input " + input[i]);
		}
		else {
			System.out.println(pattStr + " does not match input " + input[i]);		
		}
			
		}
	}

}
