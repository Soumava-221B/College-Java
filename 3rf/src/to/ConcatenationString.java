package to;
import java.util.Scanner;

public class ConcatenationString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the first string");
		String str1=sc.next();
		System.out.println("String value:"+str1);

		//Scanner sc=new Scanner(System.in);
		System.out.println("enetr the 2nd string:");
		String str2=sc.next();
		System.out.println("String value of 2nd:"+str2);
		
		String results=str1.concat(str2);
		System.out.println("result of string"+results);
		
		String h=results.substring(5,9);
		System.out.println("Final result after substring:"+h);
	}


}
