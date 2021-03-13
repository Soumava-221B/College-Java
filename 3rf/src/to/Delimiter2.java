/*
 * Write a method that takes a delimited string to store a name and address, from
which you can print a mailing label. For example, if the string contains “Sam
Penn:14 Bridge St.:Hoboken, NJ 01881,” the method should print the label shown
in the below:
Sam Penn
14 Bridge St.
Hoboken, NJ 01881
 */
package to;

import java.util.StringTokenizer;

public class Delimiter2 {

	public static void main(String[] args) {
		String url = "Sam Penn: 14 Bridge St.Hoboken, NJ 01881";
		StringTokenizer multiTokenizer = new StringTokenizer(url, ": ");
		while(multiTokenizer.hasMoreTokens())
		{
			System.out.println(multiTokenizer.nextToken());
		}
	}

}
