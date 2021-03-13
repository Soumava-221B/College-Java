package Regular_Expression;

import java.util.regex.*;

public class REMatch2 {

	public static void main(String[] args) {
		String patt = "Q[^u]\\d+\\.";
		Pattern r = Pattern.compile(patt);
		String line = "Order QT300. Now!";
		Matcher m = r.matcher(line);
		if (m.find()) 
		{
		System.out.println(patt + " matches \"" +line.substring(m.start(0), m.end(0)) +"\" in \"" + line + "\"");
		} 
		else 
		{
		System.out.println("NO MATCH");
		}

	}

}
