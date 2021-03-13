/*
 * Write a Java program to find longest Palindromic Substring within a string
Example: The given string is: thequickbrownfoxxofnworbquickthe
The longest palindrome substring in the given string is; brownfoxxofnworb
The length of the palindromic substring is: 16
 */
package to;

public class LongPalindromeString {
    static void printSubStr(String str, 
                            int low, int high) 
    { 
        System.out.println( 
            str.substring( 
                low, high + 1)); 
    } 
    static int longestPalSubstr(String str) 
    {  
        int maxLength = 1; 
        int start = 0; 
        int len = str.length(); 
        int low, high; 
         
        for (int i = 1; i < len; ++i) {  
            low = i - 1; 
            high = i; 
            while (low >= 0 && high < len 
                   && str.charAt(low) 
                          == str.charAt(high)) { 
                if (high - low + 1 > maxLength) { 
                    start = low; 
                    maxLength = high - low + 1; 
                } 
                --low; 
                ++high; 
            } 
             low = i - 1; 
            high = i + 1; 
            while (low >= 0 && high < len 
                   && str.charAt(low) 
                          == str.charAt(high)) { 
                if (high - low + 1 > maxLength) { 
                    start = low; 
                    maxLength = high - low + 1; 
                } 
                --low; 
                ++high; 
            } 
        } 
  
        System.out.print("The longest palindrome substring in the given string is: "); 
        printSubStr(str, start, start + maxLength - 1); 
  
        return maxLength; 
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "thequickbrownfoxxofnworbquickthe";
		System.out.println("The given string is: "+str);
        System.out.println("The length of the palindromic substring is: " + longestPalSubstr(str)); 

	}

}
