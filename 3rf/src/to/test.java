package to;
import java.io.*;
import java.util.StringTokenizer;
public class test {

	public static void main(String[] args) {
		String url = "htpps://www.google.com/support.php";
		String io = "htpps://www.youtube.com/support.php";
		StringTokenizer multiTokenizer = new StringTokenizer(url, "://.-");
		while (multiTokenizer.hasMoreTokens())
		{
			System.out.println(multiTokenizer.nextToken());
		}

	}

}
