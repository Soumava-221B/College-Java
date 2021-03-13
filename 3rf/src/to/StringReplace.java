/*
 * The global replace function is a string-processing algorithm found in every word
processor. Write a method that takes three String arguments: a document, a tar-
get string, and a replacement string. The method should replace every occurrence
of the target string in the document with the re- placement string. For exam-
ple, if the document is “ To be or not to be, that is the question,” and the target
string is “be,”, and the replacement string is “see,” the result should be, “To see
or not to se
 */
package to;
import java.util.Scanner;

public class StringReplace {
	private static String replace(String s1, String s2, String s3) {
		s1=s1.replaceAll(s2, s3);
		return s1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=sc.nextLine();
		System.out.println("Enter the String you want to replace");
		String s2= sc.next();
		System.out.println("Enter the Replacement String");
		String s3= sc.next();
		System.out.println(replace(s1,s2,s3));

	}


}
