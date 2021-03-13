/*
 * Write a program to check whether the entered string is a pallindrome or not.
 */
package to;
import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enetr a string");
		StringBuilder s = new StringBuilder(sc.nextLine());
		String old_s = s.toString();
        s.reverse();
        if(s.toString().equalsIgnoreCase(old_s))
        	System.out.println("String is Palindrome");
        else 
        	System.out.println("String is not Palindrome");
	}

}
