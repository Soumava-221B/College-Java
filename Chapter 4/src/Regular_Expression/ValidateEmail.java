package Regular_Expression;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {

	public static void main(String[] args) throws IOException {
PrintWriter pw = new PrintWriter("C:\\Users\\arijit das\\1941012676 CSW-1\\Chapter 4\\output.txt");
		
		Pattern p= Pattern.compile("[a-zA-z)-9]"+"[a=zA-Z0-9_.]"+"*@[a-zA-Z0-9]"+"+([.][a-zA-Z]+)+");
		
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\arijit das\\1941012676 CSW-1\\Chapter 4\\src\\Regular_Expression\\Email.txt"));
		String line = br.readLine();
		
		while(line!=null)
		{
			Matcher m= p.matcher(line);
			while(m.find())
			{
				pw.println(m.group());
				
			}
			line=br.readLine();
		}
		pw.flush();


	}

}
