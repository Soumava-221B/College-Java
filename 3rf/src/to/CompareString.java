package to;
import java.util.Scanner;

public class CompareString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two sentences");
		String u=sc.next();
		String v=sc.next();
		System.out.println("u and v "+u.equals(v)); 
		if(u==v)
		{
			System.out.println("Two lines are equal");
		}
		else
		{
			System.out.println("Not Equal");
		}

	}

}
