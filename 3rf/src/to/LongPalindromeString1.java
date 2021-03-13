package to;

public class LongPalindromeString1 {

	public static void main(String[] args) {
		String str1 = "thequickbrownfoxxofnworbquickthe";
		System.out.println("The given string is: "+str1);
		System.out.println("The length of the palindromic substring is: "+longPalSubstr(str1));

	}
	static void printSubStr(String str1, int l, int h) {
		System.out.println(str1.substring(l, h+1));
	}
	static int longPalSubstr(String str1) {
		int n = str1.length();
		boolean table[][] = new boolean[n][n];
		return n;
	}

}
