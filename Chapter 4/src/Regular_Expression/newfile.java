package Regular_Expression;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class newfile {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		Pattern p1=Pattern.compile("[A-Za-z][a-z]+");
		  BufferedReader r = new BufferedReader(new FileReader("C:\\Users\\arijit das\\1941012676 CSW-1\\Chapter 4\\src\\Regular_Expression\\Rig2.txt"));
		  String line;
		  
		  while ((line = r.readLine())!=null) {
			  Matcher m = p1.matcher(line);
			  while (m.find()) {
				  System.out.println(m.group(0));
				  int s1 = m.start(0);
				  int e1 = m.end(0);
				  System.out.println(line.substring(s1, e1));
			  }
		  }

	}

}
