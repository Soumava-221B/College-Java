/*
 * Write a program to enter a name as string and print the name in shorter manner.
 */

package to;
import java.util.Scanner;
public class PrintInitial1 {

	public static void main(String[] args) {
		String name = "Soumava Das";
		System.out.println("The full name is: "+name);
		
		int StringLength = name.length();
		name = name.trim();
		System.out.println("Initial with surname is: ");
		
		String str1 = "";
		for(int i=0;i<StringLength;i++)
		{
			char ch = name.charAt(i);
			
			if(ch!=' ')
			{
				str1 = str1 +ch;
				
			}
			else
			{
				System.out.println(Character.toUpperCase(str1.charAt(0))+ " ");
				str1 = "";
			}
		}
		String str2 = "";
		for(int j=0; j<str1.length();j++)
		{
			if(j == 0)
				str2 = str2 + Character.toUpperCase(str1.charAt(0));
			else
			{
				str2=str2+Character.toLowerCase(str1.charAt(j));
			}
			System.out.println(str2);
			
		}

	}

}
