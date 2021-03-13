/*
 * Write a java program to remove the title from a name.
Ex. Input: Mr. Sachin Tendulkar
Ms. Saina Nehwal
Output: Sachin Tendulkar
Saina Nehwal
 */
package to;

public class RemoveTitle {

	public static void main(String[] args) {
		String s="Ms. Sachin Mishra";
		int n=s.indexOf('.');
		System.out.println("Name: "+s);
		System.out.println("remove: "+s.substring(n+1));

	}

}
