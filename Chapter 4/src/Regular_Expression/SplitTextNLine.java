/*
 * Write a program to demonstrate the working of 
 * splitting a text by a given pattern. The given input is “CSE1ECE2EEE3CIVIL”.The output of the program is
look like below:
CSE
ECE
EEE
CIVIL
Use the split () and case controlling flags to solve this.
 */
package Regular_Expression;

public class SplitTextNLine {

	public static void main(String[] args) {
		String s1="CSE1ECE2EEE3CIVIL";  
		String[] words =s1.split("[0-9]+");
		for(String w:words){  
		System.out.println(w);
		}
	}

}
