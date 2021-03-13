/*
 * Write a program to extract maximum numeric value from a given string. For ex-
ample: this is “There is 60 students in csed section, 40 in cseb, and 55 in csea”
input string and output is 60.
 */
package Regular_Expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Maximum {
	static int Maxi(String str)
	{
		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher(str);
		int MAX = 0;
		while(m.find())
		{
			int num = Integer.parseInt(m.group());
			if(num>MAX)
				MAX=num;
		}
		return MAX;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="There is 60 students in csed section, 40 in cseb, and 55 in csea";
		System.out.println(" "+Maxi(str));
		
		

	}

}
