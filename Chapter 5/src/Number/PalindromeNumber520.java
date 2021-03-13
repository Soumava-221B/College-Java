package Number;

import java.util.Scanner;

public class PalindromeNumber520 {
	public static int reverse(int num) {
	int n=0;
	while (num != 0) {
		n=n*10+ (num % 10);
		num/=10;
	}
	return n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in); 
		System.out.println("Enter a number");
		int num =sc.nextInt();
		int reversedInteger = 0, remainder, originalInteger;

        originalInteger = num;
        while( num != 0 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  /= 10;
        }
        if (originalInteger == reversedInteger)
            System.out.println(originalInteger + " is a palindrome");
        else
            System.out.println(originalInteger + " is not a palindrome");

	}
}
