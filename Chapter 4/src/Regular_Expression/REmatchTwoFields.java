package Regular_Expression;

import java.util.regex.*;

public class REmatchTwoFields {

	public static void main(String[] args) {
		String inputLine = "Adams, John Quincy";   // replace Adams, John Quincy by Smith, John
		Pattern r = Pattern.compile("(.*), (.*)");
		Matcher m = r.matcher(inputLine);
		if (!m.matches())
		throw new IllegalArgumentException("Bad input");
		System.out.println(m.group(2) + ' ' + m.group(1));     // after replacing Adams, John Quincy you get John Smith

	}

}
