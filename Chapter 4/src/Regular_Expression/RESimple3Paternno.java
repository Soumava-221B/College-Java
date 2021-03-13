package Regular_Expression;

import java.util.regex.*;

public class RESimple3Paternno {

	public static void main(String[] args) {
		String pattern = "abd";
		String input = "pqr abd pxy";
		Pattern p = Pattern.compile(pattern);
		Matcher m=p.matcher(input);
		while(m.find())
		{
			System.out.println("Pattern found from "+m.start()+" to "+ (m.end()-1));
		}

	}

}
