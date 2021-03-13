/*
 * Write a java code to swap two string variables without using third or temp variable.
 */
package to;

public class SwapWithoutThird {

	public static void main(String[] args) {
        String a = "Das"; 
        String b = "Soumava"; 
        System.out.println("Strings before swap: a = " +  a + " and b = "+b);  
        a = a + b;  
        b = a.substring(0,a.length()-b.length()); 
        a = a.substring(b.length()); 
        System.out.println("Strings after swap: a = " +  a + " and b = " + b);       

	}

}
