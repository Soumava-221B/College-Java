/*
 * Write a program to get the first letter of each word in a string using regex in java. 
 * For example: the input string is "This is CSE Students" and output of the program is: TiCS.
 */
package Regular_Expression;

import java.util.regex.Matcher; 
import java.util.regex.Pattern; 

public class CharAtFirstString {

	public static void main(String[] args) {
		String s = "This is CSE Students";          
        Pattern p = Pattern.compile("\\b[a-zA-Z]");           
        Matcher m = p.matcher(s); 
        System.out.print("First letter of each word from string \"" + s + "\" : "); 
        while (m.find()) 
            System.out.print(m.group());          
 
	}

}
