/*
 * Write a program to enter a string and count how many vowels present in it.
 */
package to;
import java.util.Scanner;

public class CountVowel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int v = 0, c = 0;        
        System.out.println("Enter a sentence");
        String str=sc.next();
        for(int i = 0; i < str.length(); i++) {    
       
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {    
                    
                v++;    
            }    
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {          
                c++;    
            }    
        }    
        System.out.println("Number of vowels: " + v);    
        System.out.println("Number of consonants: " + c);    
	}

}
