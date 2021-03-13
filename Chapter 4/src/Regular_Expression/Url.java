package Regular_Expression;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Url {
	
	public static boolean isValidURL(String url) {
		
		String regex = "((http|https)://)(www.)?"
	              + "[a-zA-Z0-9@:%._\\+~#?&//=]"
	              + "{2,256}\\.[a-z]"
	              + "{2,6}\\b([-a-zA-Z0-9@:%"
	              + "._\\+~#?&//=]*)";
		Pattern p=Pattern.compile(regex);
		if (url==null) {
			return false;
		}
		
		Matcher m = p.matcher(url);
		
		return m.matches();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="https://www.miniclip.com";
		if(isValidURL(url)==true)
		{
			System.out.println("Yes given url is valid");
		}
		else
		{
			System.out.println("NO given url is not valid");
		}

	}

}
