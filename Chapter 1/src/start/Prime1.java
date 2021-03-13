package start;

import java.util.Scanner;

public class Prime1 {

	public static void main(String[] args) {
		int i,m=0,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number you want to check if it is prime");
		int n=sc.nextInt();
		m=n/2;
		if(n==0||n==1) {
			System.out.println(n+" is not a prime number");
		}
		else {
			for(i=2;i<=m;i++) {
				if(n%i==0) {
					System.out.println(n+" is not prime number");
					c=1;
					break;
				}
			}
			if(c==0) {
				System.out.println(n+" is prime number");
			}
		}

	}

}
