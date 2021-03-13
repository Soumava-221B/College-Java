package Regular_Expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CanonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String regularExpression = "b\u0307";
		
		Pattern pattern = Pattern.compile(regularExpression, Pattern.CANON_EQ);
		
		Matcher matcher = pattern.matcher("\u1E03");
		if(matcher.find())
		{
			System.out.println("Match found");
		}
		else
		{
			System.out.println("Match not found");
		}
		
		String regex = "a\u030A";
		
		Pattern pt= Pattern.compile(regex, Pattern.CANON_EQ);
		
		String [] input = {"\u00E5", "a\0311", "a\u030A", "a\u1E03", "a\uFB03"};
		
		for(String elementinput: input) {
			Matcher mc = pt.matcher(elementinput);
			if(mc.matches())
				System.out.println(elementinput+" is a match for "+regex);
			else
				System.out.println(elementinput+" is not a match for "+regex);
		}

	}

}
