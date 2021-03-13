package Regular_Expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class GroupCountRun {

	public static void main(String[] args) {
		String regex = "(.*)(\\d+)(.*)";
		String input = "Welcome to ITER, 123, Department of computer science";
		//Creating a pattern object
		Pattern pattern = Pattern.compile(regex);
		//Matching the the compile pattern in the string
		Matcher matcher = pattern.matcher(input);
		if(matcher.find())
		{
			System.out.println("First group match: "+matcher.group(1));
			System.out.println("Second group match: "+matcher.group(2));
			System.out.println("Third group match: "+matcher.group(3));
			System.out.println("Number of groups capturing: "+matcher.groupCount());
			
			String regex1= "(e(\\S+)e)(\\s)";
			String str = "ende helloe eye are mee";
			Pattern pattern1= Pattern.compile(regex1);
			Matcher matcher1=pattern1.matcher(str);
			while(matcher1.find())
			{
				System.out.println(matcher.group(0));
				System.out.println(matcher.group(1));
				System.out.println(matcher.group(2));
			}
			System.out.println("Total capturing groups: "+matcher1.groupCount());
		}

	}

}
