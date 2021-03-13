/*
 * Write a Java program to read all mobile numbers present in given file and validate it on below criteria:
-The first digit should contain number between 7 to 9.
-The rest 9 digit can contain any number between 0 to 9.
-The mobile number can have 11 digits also by including 0 at the starting.
-The mobile number can be of 12 digits also by including 91 at the starting The
number which satisfies the above criteria is a valid mobile Number.
 */
package Regular_Expression;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class CheckPhone {

	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("C:\\Users\\arijit das\\1941012676 CSW-1\\Chapter 4\\output.txt");
		
		Pattern p= Pattern.compile("(0|91)?[7-9][0-9]{9}");
		
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\arijit das\\1941012676 CSW-1\\Chapter 4\\src\\Regular_Expression\\Phone.txt"));
		String line = br.readLine();
		
		while(line!=null)
		{
			Matcher m= p.matcher(line);
			while(m.find())
			{
				pw.println("Valid Number "+m.group());
				
			}
			line=br.readLine();
		}
		pw.flush();

	}

}
