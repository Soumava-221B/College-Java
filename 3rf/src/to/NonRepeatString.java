/*
 * Write a Java program to find first non repeating character in a string .
Example: The given string is: gibblegabbler
The first non repeated character in String is: i
 */
package to;

public class NonRepeatString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "ggenegrated";
		System.out.println("The given string is: "+str1);
		
		for (int i = 0;i < str1.length(); i++) {
			boolean unique = true;
			for (int j = 0;j < str1.length(); j++) {
				if(i != j && str1.charAt(i) == str1.charAt(j)) {
					unique = false;
					break;
				}
			}
			if(!unique) {
				System.out.println("The first non repeated character in String is: "+str1.charAt(i));
				break;
		}
		
		}

	}

}
